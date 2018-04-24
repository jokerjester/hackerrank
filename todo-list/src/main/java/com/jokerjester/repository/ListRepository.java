package com.jokerjester.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jokerjester.entity.TodoList;

public interface ListRepository extends MongoRepository<TodoList, String>{

}
