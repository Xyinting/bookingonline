package com.xyt.otrs.otrsrestaurant.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("table")
public class Table {

    private int id;

    private String name;

    private int capacity;

    private int restno;

    //0-没有预定  1-预定
    private int isoder;
}
