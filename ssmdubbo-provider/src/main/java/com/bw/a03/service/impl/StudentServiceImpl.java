package com.bw.a03.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.bw.a03.entity.Student;
import com.bw.a03.mapper.StudentMapper;
import com.bw.a03.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service(interfaceClass=StudentService.class)
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentMapper stuMapper;
	@Override
	public PageInfo<Student> list(Integer pageNum, Integer pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pagesize);
		return new PageInfo<>(stuMapper.list());
	}

}
