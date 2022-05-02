package com.thedarksideofcode.TaskList.controller;

import com.thedarksideofcode.TaskList.model.BasicTask;
import com.thedarksideofcode.TaskList.service.TaskListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskListController {
    private TaskListService taskListService;
    public TaskListController(TaskListService taskListService){
        this.taskListService =taskListService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<BasicTask>> getAllTasks(){
      return taskListService.getAll();
    }
}
