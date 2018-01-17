package com.xyt.otrs.otrsrestaurant.mapper;

import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class RestaurantMapperTest {

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Test
    public void getRestByid() {

//        Restaurant restaurant = restaurantMapper.getRestByid(1);
//
//        Assert.assertEquals(1,restaurant.getId());

    }

    @Test
    public void getRestsByName() {

//        List<Restaurant> restaurants = restaurantMapper.getRestsByName("全聚德");
//
//        Assert.assertNotEquals(0,restaurants.size());
    }

    @Test
    public void getAll() {

//        List<Restaurant> restaurants = restaurantMapper.getAll();
//
//        Assert.assertNotEquals(0,restaurants.size());
    }

    @Test
    public void insertRest() {

//        Restaurant restaurant = new Restaurant();
//        restaurant.setName("全聚德（沙河店）");
//        restaurant.setAddress("北京");
//        restaurant.setPhone("18378274873");
//
//        int result = restaurantMapper.insertRest(restaurant);
//
//        log.debug("result {}",result);
//        Assert.assertEquals(1,result);


    }

    @Test
    public void updateRest() {

//        Restaurant restaurant = restaurantMapper.getRestByid(4);
//        restaurant.setName("庆丰包子");
//        int result = restaurantMapper.updateRest(restaurant);
//        Assert.assertEquals(1,result);

    }

    @Test
    public void deleteRest() {

//        Restaurant restaurant = new Restaurant();
//        restaurant.setId(6);
//
//        int result = restaurantMapper.deleteRest(restaurant);
//        Assert.assertEquals(1,result);

    }
}