package com.fedorenko.todo.repository;

import com.fedorenko.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
