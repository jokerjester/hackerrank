package com.jokerjester.todolist;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.jokerjester.entity.TodoList;
import com.jokerjester.repository.ListRepository;

@ComponentScan(basePackages= {"com"})
@EnableMongoRepositories(basePackages= {"com.jokerjester.repository"})
@SpringBootApplication
public class TodoListApplication implements CommandLineRunner{

	@Autowired
	ListRepository listRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

//		listRepository.deleteAll();
//
//		// save a couple of customers
//		listRepository.save(new TodoList(UUID.randomUUID().toString(),"Alice2", "Smith2"));
//		listRepository.save(new TodoList(UUID.randomUUID().toString(),"Alice2", "Smith2"));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (TodoList customer : listRepository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();

		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(listRepository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (List customer : listRepository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}

	}
}
