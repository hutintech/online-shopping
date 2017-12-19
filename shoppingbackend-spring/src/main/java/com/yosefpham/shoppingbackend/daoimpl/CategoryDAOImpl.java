package com.yosefpham.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yosefpham.shoppingbackend.dao.CategoryDAO;
import com.yosefpham.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setImageURL("CAT_1.png");
		category.setDescription("this is some description for television");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setImageURL("CAT_2.png");
		category.setDescription("this is some description for mobile");
		category.setActive(true);
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list(){
		
		return categories;
	}
}
