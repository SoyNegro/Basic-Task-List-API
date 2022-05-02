package com.thedarksideofcode.TaskList.service;

import com.thedarksideofcode.TaskList.model.BasicTask;
import com.thedarksideofcode.TaskList.repository.BasicTaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {
    private BasicTaskRepository basicTaskRepository;
    public TaskListService(BasicTaskRepository basicTaskRepository){
        this.basicTaskRepository = basicTaskRepository;
    }
    public ResponseEntity<List<BasicTask>> getAll() {
        return new ResponseEntity<>(basicTaskRepository.findAll(), HttpStatus.OK);
    }
}
