package com.thedarksideofcode.TaskList.controller;

import com.thedarksideofcode.TaskList.model.BasicTask;
import com.thedarksideofcode.TaskList.service.TaskListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/task/{id}")
    public ResponseEntity<BasicTask> getTaskById(@PathVariable String id){
        return taskListService.getTaskById(id);
    }

    @PostMapping("/task")
    public ResponseEntity<BasicTask> createTask(@Valid @RequestBody BasicTask basicTask){
        return taskListService.create(basicTask);
    }

    @PutMapping("/task")
    public ResponseEntity<BasicTask> updateTask(@Valid @RequestBody BasicTask basicTask){
        return taskListService.update(basicTask);
    }
}
