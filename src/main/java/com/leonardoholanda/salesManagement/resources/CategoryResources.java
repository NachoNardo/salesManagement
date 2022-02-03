package com.leonardoholanda.salesManagement.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leonardoholanda.salesManagement.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		
		Category cat1 = new Category(1, "IT");
		Category cat2 = new Category(2, "Office");
		
		List<Category> list = new ArrayList<Category>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}
	
}
