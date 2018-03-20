package com.imooc.Exception;

import com.imooc.Enum.ResultEnum;

/**
 * @author: wangbao02
 * @date: 2018/3/20 19:34
 * @Description:
 */
public class XXXException extends RuntimeException {
    private Integer code;
    private ResultEnum resultEnum;

    public XXXException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }
}
