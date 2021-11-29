package com.example.cruddesdecero.Repository;

import com.example.cruddesdecero.Model.TodoDTO;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TodoDTO,Long> {
}
