package com.bw.a03;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.a03.entity.Student;
import com.bw.a03.service.StudentService;
import com.github.pagehelper.PageInfo;

public class BootStart {
	static Logger log = Logger.getLogger(BootStart.class);

	public static void main(String[] args) throws IOException {
		log.trace("马上启动服务");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		StudentService ss = context.getBean(StudentService.class);
		PageInfo<Student> pageInfo = ss.list(1, 5);
		System.out.println("pageInfo is"+pageInfo);
		
		log.trace("启动ok.....");
		System.in.read();
	}
}
