package com.xyt.otrs.otrsrestaurant.enums;

import lombok.Getter;

@Getter
public enum OtrsRestaurantEnums {

    QUERY_FAILER(10, "没有符合的餐馆"),

    QUERYINFO_FAILER(11, "餐馆详情查询失败"),

    QUERYBOOKLIST_FAILER(12, "餐馆订单列表查询失败"),
    ;

    private int code;

    private String meg;

    OtrsRestaurantEnums(int code, String meg) {
        this.code = code;
        this.meg = meg;
    }
}
