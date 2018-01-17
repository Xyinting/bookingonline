package com.xyt.otrs.otrsrestaurant.mapper;

import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RestaurantMapper {

    Restaurant getRestByid(int id);

    List<Restaurant> getRestsByName(@Param(value="name") String name);

    List<Restaurant> getAll();

    Integer insertRest(Restaurant restaurant);

    Integer updateRest(Restaurant restaurant);

    Integer deleteRest(Restaurant restaurant);

}
