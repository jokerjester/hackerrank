package com.jokerjester.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokerjester.entity.TodoList;
import com.jokerjester.repository.ListRepository;

@Service
public class ListService {

	@Autowired
	ListRepository listRepository;
	
	public List<TodoList> findAll() {
		return listRepository.findAll();
	}
	
	public Object insert(TodoList list) {
		System.out.println(list.getId());
		return listRepository.insert(list);
	}
	
}
