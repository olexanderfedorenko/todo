package com.fedorenko.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String subject;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dueDate;
    private boolean done;
}
