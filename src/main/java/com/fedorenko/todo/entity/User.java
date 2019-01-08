package com.fedorenko.todo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String userName;
    private String email;
    private List<Todo> todo;
}
