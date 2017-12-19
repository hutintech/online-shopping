package com.yosefpham.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yosefpham.shoppingbackend.dao.CategoryDAO;
import com.yosefpham.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	@Autowired
	private SessionFactory sessionFactory;
	
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
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setImageURL("CAT_2.png");
		category.setDescription("this is some description for Laptop");
		category.setActive(true);
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list(){
		
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories)
			if(category.getId()==id) return category;
		return null;
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		category.setActive(false);
		
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
