package com.xyt.otrs.otrsrestaurant.hander;

import com.xyt.otrs.otrsrestaurant.exception.OtrsserviceException;
import com.xyt.otrs.otrsrestaurant.vo.ResultEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class OtrsExceptionHandler {

    @ExceptionHandler(value = OtrsserviceException.class)
    @ResponseBody
    public ResultEntity otrsExceptionhandler(OtrsserviceException e) {

        ResultEntity resultEntity = new ResultEntity();

        resultEntity.setCode(e.getCode());
        resultEntity.setMsg(e.getMessage());

        return resultEntity;
    }
}
