package com.xyt.otrs.otrsrestaurant.mapper;

import com.xyt.otrs.otrsrestaurant.domain.Table;
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
public class TableMapperTest {

    @Autowired
    private TableMapper tableMapper;

    @Test
    public void getTableById() {
//        Table table = tableMapper.getTableById(1);
//
//        Assert.assertNotNull(table);
    }

    @Test
    public void getTablesByRestID() {

//        List<Table> tableList = tableMapper.getTablesByRestID(1);
//
//        Assert.assertNotEquals(0,tableList.size());
    }

    @Test
    public void insertTable() {

//        Table table = new Table();
//        table.setName("table4");
//        table.setCapacity(4);
//        table.setRestno(2);
//        table.setIsoder(0);
//
//        int result = tableMapper.insertTable(table);
//
//        Assert.assertEquals(1,result);
    }

    @Test
    public void updateTable() {

//        Table table  = tableMapper.getTableById(1);
//        table.setName("table0");
//
//        int result = tableMapper.updateTable(table);
//
//        Assert.assertEquals(1,result);
    }

    @Test
    public void deleteTable() {

//        Table table = new Table();
//        table.setId(1);
//        int result = tableMapper.deleteTable(table);
//        Assert.assertEquals(1,result);
    }
}