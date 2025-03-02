package com.wwcloud.student.core;

import org.springframework.util.ObjectUtils;

/**
 * @author wmtumanday
 */
public class ResponseErrorVo {

    private String code;
    private String message;
    private String description;
    public ResponseErrorVo(String code, String message) {
        this.code = code;
        this.message = message;
        this.description = message;
    }
    public ResponseErrorVo(String code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getDescription() {
        return ObjectUtils.isEmpty(description) ? message : description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
