package com.xyt.otrs.otrsrestaurant.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("booking")
public class Book {

    private String id;

    private int restaurantid;

    private int userid;

    private int tableid;

    private String orderdate;

    private String remark;
}
