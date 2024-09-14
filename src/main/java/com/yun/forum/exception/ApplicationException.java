package com.yun.forum.exception;

import com.yun.forum.common.AppResult;

/**
 * @author yun
 * @date 2024/9/13 19:13
 * @desciption: 自定义异常
 */
public class ApplicationException extends RuntimeException {

    // 在异常中持有一个错误信息对象
    protected AppResult errorResult;

    /**
     * 构造方法
     *
     * @param errorResult
     */
    public ApplicationException(AppResult errorResult) {
        super(errorResult.getMessage());
        this.errorResult = errorResult;
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public AppResult getErrorResult() {
        return errorResult;
    }
}
