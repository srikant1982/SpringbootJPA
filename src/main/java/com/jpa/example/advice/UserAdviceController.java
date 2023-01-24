package com.jpa.example.advice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class UserAdviceController {

    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail onException(MethodArgumentNotValidException ex){
        var pd = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), ex.getMessage());
        return pd;
    }*/

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleException(MethodArgumentNotValidException ex){
        Map<String,String> errorMessage = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
                errorMessage.put(error.getField(),error.getDefaultMessage());});
        return errorMessage;
    }
}
