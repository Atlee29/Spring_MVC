package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/log")
	public String loginCheck(@RequestParam("username") String u,
		@RequestParam("password") String p,ModelMap m) {
		List<String>l=new ArrayList<>();
		l.add(u);
		l.add(p);
		m.addAttribute("nm", l);
		
			return "success";
		
	
	
		
		
	}
	

}
