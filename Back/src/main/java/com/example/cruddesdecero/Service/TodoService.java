package com.example.cruddesdecero.Service;

import com.example.cruddesdecero.Model.TodoDTO;
import com.example.cruddesdecero.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public List<TodoDTO> getAllTodos() { return (List<TodoDTO>) repository.findAll();}

    public TodoDTO getTodoById(Long id) {
        return repository.findById(id).get();
    }

    public TodoDTO saveTodo(TodoDTO usuario) {
        return repository.save(usuario);
    }

    public void deleteTodoById(Long id) {
        repository.deleteById(id);
    }
}
