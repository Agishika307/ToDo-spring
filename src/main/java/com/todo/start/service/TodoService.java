package com.todo.start.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.Repository.TodoRepository;
import com.todo.start.models.TodoModel;


@Service
public class TodoService {
    @Autowired

private TodoRepository todoRepository;
    // Method to create a new todo

    public TodoModel createTodo(TodoModel todo) {
        return todoRepository.save(todo);
    }
    
}
