package com.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.interfaces1.HelloRemoteService;

@RestController
public class ConsumerController {
	
	@Autowired
    HelloRemoteService helloRemoteService;

    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "ireturn"+helloRemoteService.findByGroupId(1);      
    }
}