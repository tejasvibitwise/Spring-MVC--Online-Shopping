package com.bitwise.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CartController {
	@Autowired
	ProductBean productbean;
	
	//@Autowired
	ProductDetails productdetails;
	
//	@RequestMapping(value="/products",method = RequestMethod.POST)
//	public String selectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
//		
//		 model.addAttribute("list",productBean.getProducts());
//		 return "products";
//		 
//		}
	
	
	@RequestMapping(value="/products",method = RequestMethod.POST)
	public String selectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
		
		List<String> itemlist=productBean.getProducts();
//		
//		 Map<String,ProductDetails> productmap=new HashMap<String,ProductDetails>();
//		 
//		 productmap.put(itemlist.get(1), new ProductDetails(10,20));
//		 productmap.put(itemlist.get(2), new ProductDetails(30,40));
//		 productmap.put(itemlist.get(3), new ProductDetails(50,60));
//		 
		 
		 model.addAttribute("list",productBean.getProducts());
		 return "products";
		}
	
	 @RequestMapping(value="/delete",method = RequestMethod.POST)
		public String DeleteselectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
			
			List<String> itemlist=productBean.getProducts();
			
			 model.addAttribute("list",itemlist);
			 return "del";
			}
	
	
	
	
	
	
	
	
	
	
}
