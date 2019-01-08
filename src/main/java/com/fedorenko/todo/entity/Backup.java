package com.fedorenko.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by OFedorenko on 01/08/19 ToDo.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Backup implements Serializable {
    private static final long serialVersionUID = 1L;

    private String backupId;
    private Date backupDate;
    private BackupStatus backupStatus;

    private enum BackupStatus {
        INPROGRESS, OK, FAILED
    }

}
