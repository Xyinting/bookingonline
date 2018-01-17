package com.xyt.otrs.otrsrestaurant.util;

import com.xyt.otrs.otrsrestaurant.domain.Table;
import com.xyt.otrs.otrsrestaurant.vo.ResultEntity;

public class ResultUtile {

    public static  ResultEntity successResult(Object object){

        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(0);
        resultEntity.setMsg("成功");
        resultEntity.setObject(object);

        return resultEntity;
    }
}
