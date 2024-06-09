package com.wwcloud.student.service.impl;

import com.github.pagehelper.PageInfo;
import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.mapper.StudentMapper;
import com.wwcloud.student.model.StudentModel;
import com.wwcloud.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wmtumanday
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    /**
     * get list of student
     * @param studentDto
     * @return PageInfo<StudentModel>
     */
    @Override
    public PageInfo<StudentModel> getStudentList(StudentDto studentDto) {
        List<StudentModel> studentModelList = studentMapper.queryStudentList(studentDto);
        return new PageInfo<>(studentModelList);
    }
}
