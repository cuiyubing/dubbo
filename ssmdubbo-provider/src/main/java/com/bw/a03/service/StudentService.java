package com.bw.a03.service;

import com.bw.a03.entity.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {
	PageInfo<Student> list(Integer pageNum,Integer pagesize);
	

}
