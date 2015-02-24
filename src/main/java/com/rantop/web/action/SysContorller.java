package com.rantop.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sys/")
public class SysContorller {
	
	@RequestMapping("showMessage")
	public String showMessage(){
		return "showMessage";
	}
	
	@RequestMapping("bootTest")
	public ModelAndView bootTest(){
		String hello = "Bootstrap Template";
		return new ModelAndView("indexBoo","message",hello);
	}
}
