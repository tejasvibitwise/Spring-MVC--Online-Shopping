package com.bitwise.spring1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitwise.cart.ProductBean;
import com.bitwise.cart.ProductDetails;
import com.bitwise.spring1.LoginBean;


@Controller
//@RequestMapping("/helloworld")
public class LoginController {
	
@Autowired
LoginBean loginbean;

@Autowired
LoginValidator loginvalidator;

//ProductDetails p1=new ProductDetails();


ProductDetails p1[]={new ProductDetails("product 1",10,20),
new ProductDetails("product 2",30,40),
new ProductDetails("product 3",50,60)};



	
	@RequestMapping(value="/login",method = RequestMethod.GET)
    public String init(Model model) {
		//model.addAttribute("message","Please enter following details");
		model.addAttribute("LoginBean", new LoginBean());
	    return "login";
    }
 
	
		
	@RequestMapping(method = RequestMethod.POST)
	   public String submit(Model model, @ModelAttribute("LoginBean") LoginBean loginBean,BindingResult result) {
	
	loginvalidator.validate(loginBean, result);

	if(result.hasErrors()) return "login";
	else
		{
		model.addAttribute("message","Online shopping");
		model.addAttribute("ProductBean",new ProductBean());
		return "success";
		}
	 }
	 
	 @ModelAttribute("itemlist")
	 public List<String> populateWebFrameworkList() {
	List<String> itemlist=new ArrayList<String>();
		
		itemlist.add(p1[0].getName());
		itemlist.add(p1[1].getName());
		itemlist.add(p1[2].getName());
		return itemlist;
	 	
	 }
	 
 
	 
	 
	 @RequestMapping(value="/details",method = RequestMethod.POST)
		public String selectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
			
			List<String> itemlist=productBean.getProducts();
			
			List<ProductDetails> detailslist=new ArrayList<ProductDetails>();
			
			
			String [] item = itemlist.toArray(new String[itemlist.size()]);
			
			
			
			for(int i=0;i<p1.length;i++)
			{
	
				if(itemlist.contains(p1[i].getName()))
				{
					detailslist.add(p1[i]);
					
				}
			}
			 
			 model.addAttribute("list",detailslist);
			 return "details";
			}
	 
	 
//	 @RequestMapping(value="/delete",method = RequestMethod.POST)
//		public String DeleteselectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
//			
//			List<String> itemlist=productBean.getProducts();
//			
//			 model.addAttribute("list",itemlist);
//			 return "del";
//			}
		
		
	
}
