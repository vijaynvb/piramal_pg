package com.company.todoapp.services;

import com.company.todoapp.models.Todo;
import com.company.todoapp.repository.ITodoJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class TodoPGDbService implements ITodoService {

    @Autowired
    ITodoJPARepository jpaRepository;

    @Override
    public List<Todo> getAllTodos() {
        return jpaRepository.findAll();
    }

    @Override
    public Todo getById(int id) {
        var todo = jpaRepository.findById(id);
        return todo.get();
    }

    @Override
    public Todo addTodo(Todo todo) {
        // TODO Auto-generated method stub
        return jpaRepository.save(todo);
    }

    @Override
    public Todo updateTodo(int id, Todo todo) {
        // TODO Auto-generated method stub
        Optional<Todo> existingTodo = jpaRepository.findById(id);
        if (existingTodo.isPresent()) {
            Todo updateTodo = existingTodo.get();
            updateTodo.setTitle(todo.getTitle());
            return jpaRepository.save(todo);
        }
        return null;

    }

    @Override
    public Todo deleteTodo(int id) {
        // TODO Auto-generated method stub
        Optional<Todo> existingTodo = jpaRepository.findById(id);
        if (existingTodo.isPresent()) {
            jpaRepository.deleteById(id);
            return existingTodo.get();
        }
        return null;
    }

    @Override
    public List<Todo> getByTitle(String title) {
        // TODO Auto-generated method stub
        var todos = jpaRepository.findByTitle(title);
        return todos.get();
    }
}
