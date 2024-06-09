package com.wwcloud.student.core;

/**
 * @author wmtumanday
 */
public class ResponseHelper<T> {
    private final ResponseVO<T> responseVO = new ResponseVO<>();


    private ResponseHelper<T> result(String result) {
        responseVO.setResult(result);
        return this;
    }
    private ResponseHelper<T> status(String status) {
        responseVO.setStatus(status);
        return this;
    }
    public ResponseHelper<T> success() {
        return new ResponseHelper<T>().result("Succeed").status("200");
    }
    public ResponseHelper<T> fail() {
        return new ResponseHelper<T>().result("Failed").status("500");
    }
    public ResponseHelper<T> error(ResponseErrorVo error) {
        responseVO.setError(error);
        responseVO.setResult("Failed");
        responseVO.setStatus("500");
        return this;
    }
    public ResponseHelper<T> addData(final T body) {
        responseVO.setData(body);
        responseVO.setResult("Succeeded");
        responseVO.setStatus("200");
        return this;
    }
    public ResponseVO<T> build() {
        return responseVO;
    }
}
