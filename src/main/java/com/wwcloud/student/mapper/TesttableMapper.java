package com.wwcloud.student.mapper;


import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2024-06-09
 */
@Mapper
public interface TesttableMapper{

    List<StudentModel> queryStudentList(StudentDto studentDto);
}
