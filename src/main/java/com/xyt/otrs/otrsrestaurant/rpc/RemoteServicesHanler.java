package com.xyt.otrs.otrsrestaurant.rpc;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.discovery.converters.Auto;
import com.xyt.otrs.otrsrestaurant.domain.Book;
import com.xyt.otrs.otrsrestaurant.feignclients.BookFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RemoteServicesHanler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private BookFeignClient bookFeignClient;

    public List<Book> queryBookListById(int id) {

        Object resutl = bookFeignClient.getBooksByRestID(id).getObject();

        if(resutl == null){
            return null;
        }

        JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, Book.class);
        List<Book> books = objectMapper.convertValue(resutl, javaType);

        return books;
    }
}
