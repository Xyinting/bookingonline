package com.xyt.otrs.otrsrestaurant.feignclients;

import com.xyt.otrs.otrsrestaurant.domain.Book;
import com.xyt.otrs.otrsrestaurant.feignclients.impl.BookFeignFallback;
import com.xyt.otrs.otrsrestaurant.vo.ResultEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "otrs-booking",fallback = BookFeignFallback.class)
@Primary
public interface BookFeignClient {

    @GetMapping("/restlist/{id}")
    ResultEntity getBooksByRestID(@PathVariable("id") int id);
}
