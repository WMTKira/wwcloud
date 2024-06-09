package com.wwcloud.student.service;

import com.github.pagehelper.PageInfo;
import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.model.StudentModel;

/**
 * @author wmtumanday
 */
public interface StudentService {


    /**
     * get list of student
     * @param studentDto
     * @return PageInfo<StudentModel>
     */
    PageInfo<StudentModel> getStudentList(StudentDto studentDto);
}
