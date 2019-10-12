package com.mingyin.serviceA;

import com.mingyin.sevice.Iservicea;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ServiceAController implements Iservicea {

    public String sayHello(@RequestParam("name") String name) {
        return "{'msg': 'hello, " + name + "'}";
    }

    @Override
    public String findById(String id) {
        String suc="查id是"+id+"用户";
        return suc;
    }


}
