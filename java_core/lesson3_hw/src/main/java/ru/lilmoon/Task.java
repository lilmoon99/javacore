package ru.lilmoon;

import java.time.LocalDate;

public class Task {
    int taskId;
    String taskName;
    LocalDate taskBeginningDate;
    LocalDate taskExpirationDate;

    static int idCounter = 0;

    public Task(int taskId, String taskName, LocalDate taskBeginningDate, LocalDate taskExpirationDate) {
        idCounter++;
        this.taskId = idCounter;
        this.taskName = taskName;
        this.taskBeginningDate = taskBeginningDate;
        this.taskExpirationDate = taskExpirationDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getTaskBeginningDate() {
        return taskBeginningDate;
    }

    public void setTaskBeginningDate(LocalDate taskBeginningDate) {
        this.taskBeginningDate = taskBeginningDate;
    }

    public LocalDate getTaskExpirationDate() {
        return taskExpirationDate;
    }

    public void setTaskExpirationDate(LocalDate taskExpirationDate) {
        this.taskExpirationDate = taskExpirationDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskBeginningDate=" + taskBeginningDate +
                ", taskExpirationDate=" + taskExpirationDate +
                '}';
    }
}
