package com.jokerjester.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jokerjester.entity.TodoList;
import com.jokerjester.service.ListService;

@Controller
public class ListController {
	
	@Autowired
	ListService listService;
    
	@GetMapping(path="/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping(path="/find-list")
	public String findAll() {	
		for(TodoList l : listService.findAll()) {
			System.out.println(l);
		}
		return "greeting";
	}
	
	@GetMapping(path="/insert-list")
	public String insert() {	
		TodoList list = new TodoList();
		list.setId(UUID.randomUUID().toString());
		list.setDate("25610423");
		list.setDetail("TEST");
		 listService.insert(list);
		 return "greeting";
	}
}
