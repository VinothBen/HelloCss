package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InitialisationController {

	@RequestMapping("hello")
	public ModelAndView showMessage() {
		ModelAndView mv = new ModelAndView("helloworld");
		return mv;
	}

	@RequestMapping("hello1")
	public ModelAndView searchPageInisialise() {
		ModelAndView mv = new ModelAndView("search");
		return mv;
	}

	@RequestMapping("hello2")
	public ModelAndView csspage() {
		ModelAndView mv = new ModelAndView("HomePage");
		return mv;
	}
	@RequestMapping("regist")
	public ModelAndView registrationPage() {
		ModelAndView mv = new ModelAndView("registration");
		return mv;
	}
	@RequestMapping("homeloan")
	public ModelAndView homeLoanPage() {
		ModelAndView mv = new ModelAndView("homeloan");
		return mv;
	}
	@RequestMapping("personal")
	public ModelAndView personalLoanPage() {
		ModelAndView mv = new ModelAndView("personalloan");
		return mv;
	}
}
