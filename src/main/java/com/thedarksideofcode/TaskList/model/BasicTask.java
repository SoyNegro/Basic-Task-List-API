package com.thedarksideofcode.TaskList.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document
public class BasicTask {
    @Id
    private String id;

    @Size(min = 3, max = 300)
    private String Task;

    public BasicTask() {
    }

    public BasicTask(String task){
        this.Task = task;
    }

    public BasicTask(String id, String task){
        this.id = id;
        this.Task = task;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }
}
