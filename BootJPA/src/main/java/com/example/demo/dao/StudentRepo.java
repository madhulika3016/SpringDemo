package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

//for rest example we are using JpaRepository instead of crudRepository
//it extends PagingandSorting interface which extends CrudRepository

public interface StudentRepo extends JpaRepository<Student, Integer>
//extends CrudRepository<Student, Integer>
{
	List<Student> findByTech(String tech);
	List<Student>  findBySidGreaterThan(int sid);
	
	@Query("From Student where tech=?1 order by sname")
	List<Student> findByTechSorted(String tech);
}
