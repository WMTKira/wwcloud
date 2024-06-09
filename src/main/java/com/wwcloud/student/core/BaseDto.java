package com.wwcloud.student.core;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wmtumanday
 */
@Data
public class BaseDto {

    private Integer pageSize;
    private Integer pageNum;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer siteId;

}
