package com.xyt.otrs.otrsrestaurant.service.impl;

import com.xyt.otrs.otrsrestaurant.vo.RestaurantVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantServiceImplTest {

    @Autowired
    RestaurantServiceImpl restaurantService = new RestaurantServiceImpl();

    @Test
    public void displayAll() {

//        List<RestaurantVO> restaurantVOList = restaurantService.displayAll();
//        Assert.assertNotEquals(0,restaurantVOList.size());
    }

    @Test
    public void queryRestByName() {

//        List<RestaurantVO> restaurantVOList = restaurantService.queryRestByName("全聚德");
//
//        Assert.assertNotEquals(0,restaurantVOList.size());
    }

    @Test
    public void queryRest() {

//        RestaurantVO restaurantVO = restaurantService.queryRest(4);
//
//        Assert.assertNotNull(restaurantVO);

    }

    @Test
    public void updateRest() {
    }
}