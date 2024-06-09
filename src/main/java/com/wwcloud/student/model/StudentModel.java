package com.wwcloud.student.model;

import lombok.Data;

/**
 * @author wmtumanday
 */
@Data
public class StudentModel {

    private Long id;

    private String studentName;

    private Integer gender;

    private String genderStr;
    public String getGenderStr() {
        return gender == 0 ? "Male" : "Female";
    }

}
