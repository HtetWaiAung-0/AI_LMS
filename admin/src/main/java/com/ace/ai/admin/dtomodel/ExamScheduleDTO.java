package com.ace.ai.admin.dtomodel;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExamScheduleDTO {
    private int id;
    private String examName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
}
