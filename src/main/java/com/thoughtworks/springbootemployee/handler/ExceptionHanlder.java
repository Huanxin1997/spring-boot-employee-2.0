package com.thoughtworks.springbootemployee.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHanlder {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "no resource";
    }
    @ExceptionHandler(IllegalAccessError.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String illegalOperate() {
        return "you can't do that";
    }

}
