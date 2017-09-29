package com.uzair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uzair.model.Todo;
import com.uzair.service.TodoService;

@RestController
@RequestMapping("api/v1/")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@RequestMapping(value="todos", method=RequestMethod.GET)
	public List<Todo> list() {
		return service.getAllTodos();
	}
	
	@RequestMapping(value="todos", method=RequestMethod.POST)
	public Todo create(@RequestBody Todo todo) {
		return service.saveTodo(todo);
	}
	
	@RequestMapping(value="todos/{id}", method=RequestMethod.GET)
	public Todo get(@PathVariable String id) {
		return service.getTodo(id);
	}
	
	@RequestMapping(value="todos/{id}", method=RequestMethod.PUT)
	public Todo update(@PathVariable String id, @RequestBody Todo todo) {
		return service.updateTodo(id, todo);
	}
	
	@RequestMapping(value="todos/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		service.deleteTodo(id);
	}
}
