package com.wwcloud.student.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.mapper.TesttableMapper;
import com.wwcloud.student.model.StudentModel;
import com.wwcloud.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wmtumanday
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Resource
    private TesttableMapper studentMapper;

    /**
     * get list of student
     * @param studentDto
     * @return PageInfo<StudentModel>
     */
    @Override
    public PageInfo<StudentModel> getStudentList(StudentDto studentDto) {
        log.info("dto:{}",studentDto.getPageNum());
        PageHelper.startPage(studentDto.getPageNum(),studentDto.getPageSize());
        List<StudentModel> studentModelList = studentMapper.queryStudentList(studentDto);
            if (studentModelList == null){
                return new PageInfo<>();
            }
            PageInfo pageInfo = new PageInfo(studentModelList);
        return pageInfo;
    }
}
