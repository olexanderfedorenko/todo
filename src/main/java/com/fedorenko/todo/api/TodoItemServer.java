package com.fedorenko.todo.api;

import com.fedorenko.todo.entity.Todo;
import com.fedorenko.todo.entity.User;

import java.util.List;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
public interface TodoItemServer {

    List<User> getUsers();
    User getUser(String id);
    void createUser(User user);
    void deleteUser(String id);
    void loadData(List<User> users);
    List<Todo> getTodo(String userId, String todoId);
    void createTodo(String userId, Todo todo);
    void updateTodo(String userId, Todo todo);
    void deleteTodo(String userId, String todoId);


}
