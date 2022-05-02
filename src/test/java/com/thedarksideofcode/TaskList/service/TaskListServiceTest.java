package com.thedarksideofcode.TaskList.service;

import com.thedarksideofcode.TaskList.model.BasicTask;
import com.thedarksideofcode.TaskList.repository.BasicTaskRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class TaskListServiceTest {

    @Mock
    BasicTaskRepository basicTaskRepository;

    @InjectMocks
    TaskListService taskListService;

    private BasicTask basicTask1;

    private ResponseEntity<BasicTask> okResponseEntity;
    private ResponseEntity<BasicTask> createdResponseEntity;
    private ResponseEntity<String> notFoundResponseEntity;
    private ResponseEntity<String> badRequestResponseEntity;

    @BeforeEach
    void settingUp(){
     basicTask1 = new BasicTask("EasyFakeId1","Will test the different responses");
     okResponseEntity = new ResponseEntity<>(basicTask1, HttpStatus.OK);
     createdResponseEntity =  new ResponseEntity<>(basicTask1, HttpStatus.CREATED);
     notFoundResponseEntity =  new ResponseEntity<>(HttpStatus.NOT_FOUND);
     badRequestResponseEntity =  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
