package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mycompany.webapp.dto.Product;

@Mapper
public interface ProductDao {
	public Product selectOne(@Param("pcode") String pcode,@Param("pcolor") String pcolor,@Param("psize") String psize);
	public List<Product> selectByPcode(String pcode);
	public List<Product> selectAll();
	public void updateStock(Product product);
	public List<Product> selectByPname(String pname);
}