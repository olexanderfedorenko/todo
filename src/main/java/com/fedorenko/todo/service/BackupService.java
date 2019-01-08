package com.fedorenko.todo.service;

import com.fedorenko.todo.entity.Backup;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */

@Service
public interface BackupService {
    String backupAll();
    List<Backup> getBackupStatus();
    String backupById(String id);
}
