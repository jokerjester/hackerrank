package com.jokerjester.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokerjester.entity.List;
import com.jokerjester.repository.ListRepository;

@Service
public class ListService {

	@Autowired
	ListRepository listRepository;
	
	public Object findAll() {
		return listRepository.findAll();
	}
	
	public Object insert(List list) {
		return listRepository.insert(list);
	}
}
