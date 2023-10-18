package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;

@Component
public class StudentService
{
	//private static List<Student>list=new ArrayList<>();
//	static 
//	{
//	   list.add(new Student(101,"Raj","Pune"));
//	   list.add(new Student(102,"Sham","Nashil"));
//	   list.add(new Student(103,"Kavya","Mumbai"));
//	}
	@Autowired
	private StudentRepository studentRepository;
	public Student getStudentById(int id)
	{
//		Student st= null;
//		try {
//		st=list.stream().filter(e->e.getSid()==id).findFirst().get();
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		return st;
		Student student=this.studentRepository.findById(id);
		return(student);
	}
	public List<Student> getAllStudents()
	{
		//return list;
		List<Student>list=(List<Student>)this.studentRepository.findAll();
		return list;
	}
	public Student addStudent(Student s) {
//		list.add(s);
//		return s;
		Student st=this.studentRepository.save(s);
		return st;
	}
	public void deleteStudentById(int id) {
//		list=list.stream().filter(student->(student.getSid()!=id))
//				.collect(Collectors.toList());
		this.studentRepository.deleteById(id);
		
	}
	
	public void updateStudent(Student student, int id) {
//		list.stream().map(s->
//		{
//			if(s.getSid()==id)
//			{
//				
//				s.setCity(student.getCity());
//				s.setName(student.getName());
//			}
//			return s;
//		}).collect(Collectors.toList());
		student.setSid(id);
		this.studentRepository.save(student);
		
	}
	
	
}
