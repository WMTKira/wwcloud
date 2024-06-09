package com.wwcloud.student.dto;

import com.wwcloud.student.core.BaseDto;
import lombok.Data;

/**
 * @author wmtumanday
 */
@Data
public class StudentDto extends BaseDto {

    private Long id;

    private String studentName;

    private Integer gender;

}
