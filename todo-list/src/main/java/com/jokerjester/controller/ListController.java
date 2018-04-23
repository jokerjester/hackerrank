package com.jokerjester.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jokerjester.entity.List;
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
	public Object findAll() {		
		return listService.findAll();
	}
	
	@GetMapping(path="/insert-list")
	public Object insert() {	
		List list = new List();
		list.setId(UUID.randomUUID().toString());
		list.setDate("25610423");
		list.setDetail("TEST");
		return listService.insert(list);
	}
}
