package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @Autowired
    private DiscoveryClient client;
    
    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.GET) // [B]
    String findByGroupId(@PathVariable("groupId") Integer groupId){
    	return groupId + ":"+client.getLocalServiceInstance().getPort();
    }

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.PUT)
    void update(@PathVariable("groupId") Integer groupId, @RequestParam("groupName") String groupName){
    	System.out.println(groupId + ":"+client.getLocalServiceInstance().getPort());
    }
}