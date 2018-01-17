package com.xyt.otrs.otrsrestaurant.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class ResultEntity {

    private int code;

    private String msg;

    private Object object;

    public ResultEntity() {
    }
}
