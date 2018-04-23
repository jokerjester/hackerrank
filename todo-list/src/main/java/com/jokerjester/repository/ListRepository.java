package com.jokerjester.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jokerjester.entity.List;

public interface ListRepository extends MongoRepository<List, String>{

}
