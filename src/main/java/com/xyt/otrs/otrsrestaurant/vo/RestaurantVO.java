package com.xyt.otrs.otrsrestaurant.vo;

import com.xyt.otrs.otrsrestaurant.domain.Book;
import com.xyt.otrs.otrsrestaurant.domain.Table;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantVO {

    private int id;

    private String name;

    private String address;

    private String phone;

    private List<Table> tableList;

    private List<Book> books;

}
