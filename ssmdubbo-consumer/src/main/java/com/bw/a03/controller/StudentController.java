package com.bw.a03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bw.a03.entity.Student;
import com.bw.a03.service.StudentService;
import com.github.pagehelper.PageInfo;

@RequestMapping("stu")
@Controller
public class StudentController {

	@Reference
	StudentService studentService;
	@RequestMapping(value="list",method=RequestMethod.GET)
//	@GetMapping
	public String list(HttpServletRequest request) {
		PageInfo<Student> pageInfo = studentService.list(1, 10);
		request.setAttribute("pageInfo", pageInfo);
		return "list";
	}
}
