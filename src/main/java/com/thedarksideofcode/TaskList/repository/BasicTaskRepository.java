package com.thedarksideofcode.TaskList.repository;

import com.thedarksideofcode.TaskList.model.BasicTask;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicTaskRepository extends MongoRepository<BasicTask,String> {
    boolean existsByTask(String task);
}
