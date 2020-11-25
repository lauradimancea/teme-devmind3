package com.devmind.temedevmind3.beanLifecycle;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Task {

    private static final Random RANDOM = new Random();

    private static int numberOfTasks = 0;
    private static int id = 0;

    private String taskName;
    private Integer taskId;
    private Integer executionTime;

    public void run() {
        try {
            Thread.sleep(executionTime);
            numberOfTasks++;
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public int generateId() {
        return id;
    }

    private void init() {

        taskId = numberOfTasks;
        taskName = "Task" + taskId;
        executionTime = RANDOM.nextInt(20 - 1) + 1;
        numberOfTasks++;
        id++;
    }

    private void destroy() {
        numberOfTasks--;
        System.out.println("Task name: " + taskName + " nr of tasks " + numberOfTasks);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskId=" + taskId +
                ", executionTime=" + executionTime +
                '}';
    }
}
