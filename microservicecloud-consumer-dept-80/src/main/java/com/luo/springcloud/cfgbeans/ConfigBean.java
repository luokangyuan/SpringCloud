package com.luo.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate(){
		return new RestTemplate();
	}
	@Bean
	public IRule myRule(){
		return new RandomRule();
	}
}
