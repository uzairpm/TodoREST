package com.uzair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uzair.model.Todo;
import com.uzair.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository repository;
	
	public List<Todo> getAllTodos() {
		return repository.findAll();
	}
	
	public Todo getTodo(String id) {
		return repository.findOne(id);
	}
		
	public Todo saveTodo(Todo t) {
		return repository.save(t);
	}
	
	public Todo updateTodo(String id, Todo t) {
		return repository.save(t);
	}
	
	public void deleteTodo(String id) {
		repository.delete(id);
	}
}
