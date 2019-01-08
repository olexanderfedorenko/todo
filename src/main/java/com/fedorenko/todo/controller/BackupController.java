package com.fedorenko.todo.controller;

import com.fedorenko.todo.common.exception.TodoException;
import com.fedorenko.todo.common.logging.Loggable;
import com.fedorenko.todo.service.BackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */

@RestController
@RequestMapping(value = "/")
public class BackupController {

    private final BackupService backupService;

    @Autowired
    public BackupController(final BackupService backupService) {
        this.backupService = backupService;
    }


    @Loggable
    @RequestMapping(value = "/backups", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity backups() throws TodoException {
        return new ResponseEntity(HttpStatus.OK);
    }

    @Loggable
    @RequestMapping(value = "/backups", method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getBackups() throws TodoException {
        return new ResponseEntity(HttpStatus.OK);
    }

    @Loggable
    @RequestMapping(value = "/exports/{backup_id}", method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity export(@PathVariable String backup_id) throws TodoException {
        return new ResponseEntity(HttpStatus.OK);
    }
}
