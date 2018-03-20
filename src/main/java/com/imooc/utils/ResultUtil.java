package com.imooc.utils;


import com.imooc.Enum.ResultEnum;
import com.imooc.pojo.Result;

/**
 * Created by wangbao02
 * 2017-01-21 13:39
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static Result error(int code,String errorMessage){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(errorMessage);
        result.setData(null);
        return result;
    }
}
