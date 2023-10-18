package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestingDemo {
	@RequestMapping("/test")
	public String firstOutput()
	{
		return "this is first spring boot  project";
	}
}
