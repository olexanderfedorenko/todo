package com.fedorenko.todo.common.exception;

import com.fedorenko.todo.common.logging.LogLevel;
import lombok.Getter;


/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
public class TodoException extends Exception {
    @Getter
    private final LogLevel logLevel;

    TodoException(String message, Exception exc) {
        super(message, exc);
        this.logLevel = LogLevel.ERROR;
    }

    TodoException(String message) {
        super(message);
        this.logLevel = LogLevel.WARN;
    }
}
