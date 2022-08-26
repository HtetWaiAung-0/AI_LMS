package com.ace.ai.admin.datamodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class TeacherBatch {
    
    @Id
    private int id;
    private boolean deleteStatus;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
    public  TeacherBatch(){

    }
    public TeacherBatch(boolean deleteStatus, Teacher teacher, Batch batch) {
        this.deleteStatus = deleteStatus;
        this.teacher = teacher;
        this.batch = batch;
    }
}