package com.luo.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luo.springcloud.entities.Dept;
import com.luo.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return this.service.get(id);
	}
	
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(){
		return this.service.list();
	}
	
	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept){
		return this.add(dept);
	}
}
