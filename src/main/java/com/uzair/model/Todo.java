package com.uzair.model;

import org.springframework.data.annotation.Id;

public class Todo {
	@Id
	String id;
	String name;
	String description;
	String condition;

	public Todo() { }

	public Todo(String id, String name, String description, String condition) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
    public String toString() {
        return String.format("Todo[name=%s]",name);
    }
}
