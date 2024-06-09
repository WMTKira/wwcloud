package com.wwcloud.student.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwcloud.student.core.ResponseHelper;
import com.wwcloud.student.core.ResponseVO;
import com.wwcloud.student.dto.StudentDto;
import com.wwcloud.student.model.StudentModel;
import com.wwcloud.student.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.List;

/**
 * @author wmtumanday
 */
@RequestMapping("/student")
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;


    /**
     * return paginated list of student
     * @param studentDto
     * @return
     */

    @PostMapping("/list")
    public ResponseEntity getStudentList(@RequestBody StudentDto studentDto) {
        PageInfo<StudentModel> pageInfo = studentService.getStudentList(studentDto);
        return ResponseEntity.ok(pageInfo);
    }




}
