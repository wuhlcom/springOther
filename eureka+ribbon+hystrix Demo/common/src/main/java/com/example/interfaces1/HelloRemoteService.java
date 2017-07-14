package com.example.interfaces1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="my-service",fallback=HystrixFallback.class)  //  [A]
public interface HelloRemoteService {

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.GET) // [B]
    String findByGroupId(@PathVariable("groupId") Integer adGroupId); // [C]

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.PUT)
    void update(@PathVariable("groupId") Integer groupId, @RequestParam("groupName") String groupName);
}
