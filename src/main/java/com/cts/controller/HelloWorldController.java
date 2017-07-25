package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.service.LoginServiceImpl;
import com.cts.vo.LoginVo;
import com.cts.vo.RegistrationUserVo;

@Controller
public class HelloWorldController {

	@Autowired
	private LoginServiceImpl loginServiceImpl;


	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginDetails(@ModelAttribute(value = "loginpage") LoginVo loginVo, BindingResult result) {
		ModelAndView model = new ModelAndView();

		if (result.hasErrors()) {
			model.addObject("msg", "Error While Procesing!!");
			model.setViewName("helloworld");
		} else {
			String name = loginServiceImpl.addLogin(loginVo);
			model.addObject("msg", name);
			model.setViewName("helloworld");
		}
		return model;
	}

	@RequestMapping(value = "search", method = RequestMethod.POST)
	public ModelAndView searchDetails(@ModelAttribute(value = "searchpage") LoginVo loginVo, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			modelAndView.addObject("msg", "Error While Procesing!!");
			modelAndView.setViewName("search");
		}

		else {
			List<LoginVo> allList = loginServiceImpl.getList(loginVo);
			modelAndView.addObject("getlist", allList);
			modelAndView.setViewName("resultlist");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "adduser", method=RequestMethod.POST)
	public ModelAndView addRegistration(@ModelAttribute(value="registration_page")RegistrationUserVo registrationUser,BindingResult result){
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	@RequestMapping(value = "addhomeloan", method=RequestMethod.POST)
	public ModelAndView addHomeloan(@ModelAttribute(value="homeloan_page")RegistrationUserVo registrationUser,BindingResult result){
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("homeloan");
		return modelAndView;
	}
	
	@RequestMapping(value = "addpersonalloan", method=RequestMethod.POST)
	public ModelAndView addpersonalloan(@ModelAttribute(value="personalloan_page")RegistrationUserVo registrationUser,BindingResult result){
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("personalloan");
		return modelAndView;
	}
}
