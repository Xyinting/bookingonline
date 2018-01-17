package com.xyt.otrs.otrsrestaurant.controller;

import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import com.xyt.otrs.otrsrestaurant.mapper.RestaurantMapper;
import com.xyt.otrs.otrsrestaurant.service.Restaurantservice;
import com.xyt.otrs.otrsrestaurant.util.ResultUtile;
import com.xyt.otrs.otrsrestaurant.vo.RestaurantVO;
import com.xyt.otrs.otrsrestaurant.vo.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/restaurant")
@Slf4j
public class RestaurantController {

    @Autowired
    private Restaurantservice restaurantservice;

    @Autowired
    private RestaurantMapper restaurantMapper;

    @GetMapping("/all")
    public ResultEntity getAll() {

        List<RestaurantVO> restaurantVOS = restaurantservice.displayAll();

        return ResultUtile.successResult(restaurantVOS);

    }

    @GetMapping("/list/{name}")
    public ResultEntity getListByName(@PathVariable("name") String name) {

        List<RestaurantVO> restaurantVOS = restaurantservice.queryRestByName(name);

        return ResultUtile.successResult(restaurantVOS);
    }

    @GetMapping("/info/{id}")
    public ResultEntity getRestInof(@PathVariable("id") int id) {

        RestaurantVO restaurantVO = restaurantservice.queryRest(id);

        return ResultUtile.successResult(restaurantVO);
    }

    @GetMapping("/restinfo/{id}")
    public ResultEntity getRestInfo(@PathVariable("id") int id) {

//        List<Restaurant> restaurant = restaurantMapper.getAll();
        Restaurant restaurant = restaurantMapper.getRestByid(id);

        return ResultUtile.successResult(restaurant);
//        return restaurant;
    }

    @GetMapping("/bookList/{id}")
    public ResultEntity getBookList(@PathVariable("id") int id) {

        RestaurantVO restaurantVO = restaurantservice.getBookList(id);

        return ResultUtile.successResult(restaurantVO);

    }
}
