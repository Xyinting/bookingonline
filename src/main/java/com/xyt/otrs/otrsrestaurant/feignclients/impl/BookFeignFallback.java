package com.xyt.otrs.otrsrestaurant.feignclients.impl;

import com.xyt.otrs.otrsrestaurant.feignclients.BookFeignClient;
import com.xyt.otrs.otrsrestaurant.vo.ResultEntity;
import org.springframework.stereotype.Component;

@Component
public class BookFeignFallback implements BookFeignClient {

    @Override
    public ResultEntity getBooksByRestID(int id) {
        ResultEntity resultEntity = new ResultEntity();

        resultEntity.setCode(1);
        resultEntity.setMsg("失败");
        resultEntity.setObject(null);

        return resultEntity;
    }
}
