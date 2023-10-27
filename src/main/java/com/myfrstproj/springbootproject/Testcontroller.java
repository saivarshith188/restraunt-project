package com.myfrstproj.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {
@RequestMapping("/test")
	public String firstHandler()
	{
		return "just for testing";
	}

}
