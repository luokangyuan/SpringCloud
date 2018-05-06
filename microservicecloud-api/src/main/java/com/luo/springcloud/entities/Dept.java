package com.luo.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	
	private Long deptno; // 主键
	private String dname; // 部门名称、
	private String db_source; // 来自那个数据库，因为微服务可以一个服务对应一个数据库，同一个信息被存储到不同的数据库
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptno(12L).setDname("开发部").setDb_source("DB01");
	}
	
}
