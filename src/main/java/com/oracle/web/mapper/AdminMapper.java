package com.oracle.web.mapper;

import com.oracle.web.bean.Admin;


public interface AdminMapper {
   
	int insert(Admin record);

	Admin login(String username);
	
}