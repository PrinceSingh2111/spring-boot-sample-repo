package com.prince.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/fetch")
    //@Cacheable(cacheNames = "mydata")
    public String getData()
    {
        return "Test Data";
    }

}
