package com.flouis.filter.demo.controller;

import com.flouis.filter.demo.base.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/{name}")
	public JsonResult hello(@PathVariable String name){
		return JsonResult.success("请求成功", "Hello " + name + "!");
	}

}
