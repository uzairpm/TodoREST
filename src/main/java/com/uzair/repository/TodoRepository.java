package com.uzair.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uzair.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
