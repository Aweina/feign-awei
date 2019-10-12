package com.mingyin.sevice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/user")
public interface Iservicea {
    @RequestMapping(value = "/sayHello",
            method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name);


    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    String findById(@RequestParam("id") String id);
}