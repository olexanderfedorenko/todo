package com.fedorenko.todo.common.logging;

import java.lang.annotation.*;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Loggable {
    LogLevel logLevel() default LogLevel.INFO;
}
