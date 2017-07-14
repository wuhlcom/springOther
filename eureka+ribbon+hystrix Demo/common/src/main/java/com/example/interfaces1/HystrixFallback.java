package com.example.interfaces1;

import org.springframework.stereotype.Component;

@Component
public class HystrixFallback implements HelloRemoteService {

	@Override
	public String findByGroupId(Integer adGroupId) {
		return "HYSTRIX service";
	}

	@Override
	public void update(Integer groupId, String groupName) {

	}

}
