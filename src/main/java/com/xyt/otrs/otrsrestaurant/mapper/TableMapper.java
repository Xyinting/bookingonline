package com.xyt.otrs.otrsrestaurant.mapper;

import com.xyt.otrs.otrsrestaurant.domain.Table;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TableMapper {

    Table getTableById(int id);

    List<Table> getTablesByRestID(int restID);

    Integer insertTable(Table table);

    Integer updateTable(Table table);

    Integer deleteTable(Table table);

}
