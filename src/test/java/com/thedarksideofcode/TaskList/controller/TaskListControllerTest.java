package com.thedarksideofcode.TaskList.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(controllers = TaskListController.class)
@ExtendWith(MockitoExtension.class)
public class TaskListControllerTest {


    @Test
    void getAllTasks(){

    }

    @Test
    void givenIdShouldReturnTaskOfId(){

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
