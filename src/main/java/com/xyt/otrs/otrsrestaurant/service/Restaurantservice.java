package com.xyt.otrs.otrsrestaurant.service;

import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import com.xyt.otrs.otrsrestaurant.domain.Table;
import com.xyt.otrs.otrsrestaurant.vo.RestaurantVO;

import java.util.List;

public interface Restaurantservice {

    /**
     * 展示所有茶馆
     * @return
     */
    List<RestaurantVO> displayAll();

    /**
     * 通过名字查询餐馆
     * @param name
     * @return
     */
    List<RestaurantVO> queryRestByName(String name);

//    List<Table> queryTableByRestaurant(Restaurant restaurant);
//

    /**
     * 查询餐馆信息
     */
    RestaurantVO queryRest(int id);

    /**
     * 更新餐馆信息
     */
    RestaurantVO updateRest(int id);

    /**
     * 查询餐馆的订单信息
     */
    RestaurantVO getBookList(int id);

}
