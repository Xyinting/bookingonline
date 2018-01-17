package com.xyt.otrs.otrsrestaurant.service.impl;

import com.xyt.otrs.otrsrestaurant.domain.Book;
import com.xyt.otrs.otrsrestaurant.domain.Restaurant;
import com.xyt.otrs.otrsrestaurant.domain.Table;
import com.xyt.otrs.otrsrestaurant.enums.OtrsRestaurantEnums;
import com.xyt.otrs.otrsrestaurant.exception.OtrsserviceException;
import com.xyt.otrs.otrsrestaurant.mapper.RestaurantMapper;
import com.xyt.otrs.otrsrestaurant.mapper.TableMapper;
import com.xyt.otrs.otrsrestaurant.rpc.RemoteServicesHanler;
import com.xyt.otrs.otrsrestaurant.service.Restaurantservice;
import com.xyt.otrs.otrsrestaurant.util.ListCopyUtil;
import com.xyt.otrs.otrsrestaurant.vo.RestaurantVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class RestaurantServiceImpl implements Restaurantservice {

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Autowired
    private TableMapper tableMapper;

    @Autowired
    private RemoteServicesHanler remoteServicesHanler;

    /**
     * 展示所有的餐馆信息
     * @return
     */
    @Override
    public List<RestaurantVO> displayAll() {

        log.info("【查询所有餐馆】");
        List<RestaurantVO> restaurantVOS =new ArrayList<>();

        List<Restaurant> restaurantList = restaurantMapper.getAll();
        if (restaurantList == null || restaurantList.size() < 1) {
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERY_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERY_FAILER.getMeg());
        }

        restaurantVOS = ListCopyUtil.voCopy(restaurantVOS, restaurantList);

        return restaurantVOS;
    }

    /**
     * 根据名字查询餐馆
     * @param name
     * @return
     */
    @Override
    public List<RestaurantVO> queryRestByName(String name) {

        log.info("【查询指定名字的餐馆】");

        List<RestaurantVO> restaurantVOS =new ArrayList<>();

        List<Restaurant> restaurantList = restaurantMapper.getRestsByName(name);
        if (restaurantList == null || restaurantList.size() < 1) {
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERY_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERY_FAILER.getMeg());
        }

        restaurantVOS = ListCopyUtil.voCopy(restaurantVOS, restaurantList);

        return restaurantVOS;
    }

    /**
     * 查询餐馆详细信息
     * @param id
     * @return
     */
    @Override
    public RestaurantVO queryRest(int id) {
        log.info("【查询餐馆详情】");

        RestaurantVO restaurantVO = new RestaurantVO();
        Restaurant restaurant = restaurantMapper.getRestByid(id);
        if (restaurant == null) {
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERYINFO_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERYINFO_FAILER.getMeg());
        }

        List<Table> tableList = tableMapper.getTablesByRestID(id);
        if (tableList .size() < 1) {
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERYINFO_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERYINFO_FAILER.getMeg());
        }
        BeanUtils.copyProperties(restaurant, restaurantVO);
        restaurantVO.setTableList(tableList);

        return restaurantVO;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public RestaurantVO updateRest(int id) {
        //TODO
        return null;
    }

    @Override
    public RestaurantVO getBookList(int id) {

        RestaurantVO restaurantVO = new RestaurantVO();

        Restaurant restaurant = restaurantMapper.getRestByid(id);
        if (restaurant == null) {
            log.info("查询餐馆信息失败————【餐馆服务】");
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERYINFO_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERYINFO_FAILER.getMeg());
        }
        BeanUtils.copyProperties(restaurant, restaurantVO);

        List<Book> books = remoteServicesHanler.queryBookListById(id);
        if (books == null || books.size() < 1) {
            log.info("查询餐馆订单失败————【餐馆服务】");
            throw new OtrsserviceException(OtrsRestaurantEnums.QUERYBOOKLIST_FAILER.getCode(),
                    OtrsRestaurantEnums.QUERYBOOKLIST_FAILER.getMeg());
        }
        restaurantVO.setBooks(books);

        return restaurantVO;
    }
}
