package com.fedorenko.todo.service.impl;

import com.fedorenko.todo.api.TodoItemServer;
import com.fedorenko.todo.entity.Backup;
import com.fedorenko.todo.service.BackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Service
public class BackupServiceImpl implements BackupService {
    private final TodoItemServer todoItemServer;

    @Autowired
    public BackupServiceImpl(final TodoItemServer todoItemServer) {
        this.todoItemServer = todoItemServer;
    }

    public String backupAll() {
        return null;
    }

    public List<Backup> getBackupStatus() {
        return null;
    }

    public String backupById(String id) {
        return null;
    }
}
