package com.fedorenko.todo.repository;

import com.fedorenko.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
public interface TodoRepository extends JpaRepository<Todo, String> {
}
