package com.fedorenko.todo.api.impl;

import com.fedorenko.todo.api.TodoItemServer;
import com.fedorenko.todo.entity.Todo;
import com.fedorenko.todo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Service
public class DefaultTodoItemServerImpl implements TodoItemServer {
    @Value("${get.user.uri}")
    private URI getUsersUri;

    private final RestTemplate restTemplate;

    @Autowired
    public DefaultTodoItemServerImpl(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getUsers() {
        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(getUsersUri, User[].class);
        return Arrays.asList(responseEntity.getBody());
    }

    public User getUser(String id) {
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(getUsersUri + id, User.class);
        return responseEntity.getBody();
    }

    public void createUser(User user) {

    }

    public void deleteUser(String id) {

    }

    public void loadData(List<User> users) {

    }

    public List<Todo> getTodo(String userId, String todoId) {
        return null;
    }

    public void createTodo(String userId, Todo todo) {

    }

    public void updateTodo(String userId, Todo todo) {

    }

    public void deleteTodo(String userId, String todoId) {

    }
}
