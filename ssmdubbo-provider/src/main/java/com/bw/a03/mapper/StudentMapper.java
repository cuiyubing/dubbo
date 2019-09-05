package com.bw.a03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bw.a03.entity.Student;

@Mapper
public interface StudentMapper {
	@Select("select * from tb_stu")
	List<Student> list();

}
