package com.xyt.otrs.otrsrestaurant.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("restaurant")
public class Restaurant {

    private int id;

    private String name;

    private String address;

    private String phone;

    public Restaurant() {
    }
}
