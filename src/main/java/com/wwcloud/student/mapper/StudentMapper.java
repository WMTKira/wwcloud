package com.wwcloud.student.mapper;

import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wmtumanday
 */
@Mapper
public interface StudentMapper {


    /**
     * query student list
     * @param studentDto
     * @return
     */
    List<StudentModel> queryStudentList(StudentDto studentDto);
}
