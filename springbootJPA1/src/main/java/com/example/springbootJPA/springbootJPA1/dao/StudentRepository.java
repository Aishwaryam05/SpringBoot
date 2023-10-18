package com.example.springbootJPA.springbootJPA1.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.springbootJPA.springbootJPA1.entity.Student;
public interface StudentRepository extends CrudRepository<Student,Integer> 
{

}
