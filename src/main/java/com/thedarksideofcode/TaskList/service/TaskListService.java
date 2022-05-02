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

    public ResponseEntity<BasicTask> getTaskById(String id) {
       if (id==null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return basicTaskRepository.findById(id)
                .map(basicTask -> new ResponseEntity<>(basicTask,HttpStatus.OK))
                .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<BasicTask> create(BasicTask basicTask) {
        if (basicTask==null || basicTaskRepository.existsByTask(basicTask.getTask()))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(basicTaskRepository.save(basicTask),HttpStatus.CREATED);

    }
}
