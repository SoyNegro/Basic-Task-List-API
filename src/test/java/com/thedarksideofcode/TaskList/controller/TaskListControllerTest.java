package com.thedarksideofcode.TaskList.controller;

import com.thedarksideofcode.TaskList.model.BasicTask;
import com.thedarksideofcode.TaskList.repository.BasicTaskRepository;
import com.thedarksideofcode.TaskList.service.TaskListService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TaskListController.class)
@ExtendWith(MockitoExtension.class)
public class TaskListControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    TaskListService taskListService;

    @Test
    void getAllTasks() throws Exception{
      mockMvc.perform(get("/api/tasks")).andExpect(status().is2xxSuccessful());
    }

    @Test
    void givenIdShouldReturnTaskOfId() throws Exception{
     BasicTask basicTask = new BasicTask("EasyFakeId","Prove that given an Id will return Task of Id");
     ResponseEntity<BasicTask> re = new ResponseEntity<>(basicTask, HttpStatus.OK);
     when(taskListService.getTaskById(eq("EasyFakeId"))).thenReturn(re);
     mockMvc.perform(get("/api/task/"+ basicTask.getId())).andExpect(status().is2xxSuccessful());
    }

    @Test
    void givenWrongIdShouldReturnNotFound(){

    }

    @Test
    void givenTaskToSaveShouldReturnSavedTask(){

    }

    @Test
    void givenIdAndTaskToUpdateShouldReturnUpdatedTask(){

    }

    @Test
    void givenIdAndEmptyTaskToUpdateShouldReturnInvalidTask(){

    }

    @Test
    void givenIdToDeleteShouldDeleteTaskOfId(){

    }
}
