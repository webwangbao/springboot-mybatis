package com.imooc.handler;

import com.imooc.Exception.XXXException;
import com.imooc.pojo.Result;
import com.imooc.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);


    @org.springframework.web.bind.annotation.ExceptionHandler(value = XXXException.class)
    @ResponseBody
    public Result handleException(HttpServletResponse response, XXXException e){
         logger.error("error = {}",e);
         return ResultUtil.error(e.getResultEnum());
    }

	

}
