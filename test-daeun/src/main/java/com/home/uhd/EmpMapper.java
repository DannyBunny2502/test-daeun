package com.home.uhd;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
 
@Mapper
public interface EmpMapper {
	  DTO findAll();
 
}