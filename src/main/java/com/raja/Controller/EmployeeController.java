package com.raja.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raja.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/")
	public String register() {
		System.out.println("inside regiter method..............");
		return "register";
	}
	@PostMapping("/registerSuccess")
	public ModelAndView registerSuccess(HttpServletRequest request,Model model,Employee employee) {
		System.out.println("register succes.............");
		ModelAndView mav = new ModelAndView();
		String name = request.getParameter("empName");
		mav.addObject("name", name);
		
		mav.setViewName("getData");
		return mav;
	}

}
