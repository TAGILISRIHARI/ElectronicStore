package com.store.electronicStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.electronicStore.models.Product;
import com.store.electronicStore.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	private ProductRepository repository;
	
//	@GetMapping("","/")
	public String showProductList(Model model)
	{
		List<Product> productsList  =  repository.findAll();
		model.addAttribute("ProductsList",productsList);
		return "products/index";
	}
}
