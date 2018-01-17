package com.xyt.otrs.otrsrestaurant.util;

import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import com.xyt.otrs.otrsrestaurant.vo.RestaurantVO;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ListCopyUtil {

    public static List<RestaurantVO> voCopy(List<RestaurantVO> target, List<Restaurant> source) {

        List<RestaurantVO> restaurantVOS = new ArrayList<>();

        for (Restaurant restaurant : source) {
            RestaurantVO restaurantVO = new RestaurantVO();

            BeanUtils.copyProperties(restaurant, restaurantVO);

            restaurantVOS.add(restaurantVO);
        }
        return restaurantVOS;
    }
}
