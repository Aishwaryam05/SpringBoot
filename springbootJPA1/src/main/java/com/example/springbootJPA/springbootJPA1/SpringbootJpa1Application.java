// JPA PROGRAM IN SPRING 
package com.example.springbootJPA.springbootJPA1;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springbootJPA.springbootJPA1.dao.StudentRepository;
import com.example.springbootJPA.springbootJPA1.entity.Student;

@SpringBootApplication
public class SpringbootJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootJpa1Application.class, args);
		StudentRepository studentrepository=context.getBean(StudentRepository.class);
	
		/*1. insert single value
	 
		Student student=new Student();
		student.setSname("Arti");
		student.setCity("Mumbai");
		Student student1=studentrepository.save(student);
		System.out.println(student1);
	  */
		
		
    /*2. insert multiple values
		Student student1=new Student();
		student1.setSname("Kavya");
		student1.setCity("nashik");
		
		Student student2=new Student();
		student2.setSname("Raj");
		student2.setCity("pune");
		
		//creating a list of students
		List<Student>stud=List.of(student1,student2);
		
		//save the multiple objects
		Iterable<Student>result=studentrepository.saveAll(stud);
		
		//printing the result
		result.forEach(student->{System.out.println(student);});
	*/
		
		
	/*3. to update city of student with id 2
		Optional<Student>optional=studentrepository.findById(2);
		Student st1=optional.get();
		Student result=studentrepository.save(st1);
		System.out.println(result.getCity()+" "+result.getSname());
	*/	
	
    /*4. to see all the data from table 
	Iterable<Student>itr=studentrepository.findAll();
//  Iterator<Student> iterator=itr.iterator();
//	while(iterator.hasNext())
//	{
//		Student stud=iterator.next();
//		System.out.println(stud);
//	}
	itr.forEach(student->{System.out.println(student);});
 */
 
		
  /* 5.to see all the data
		Iterable<Student>itr=studentrepository.findAll();
		itr.forEach(student->{System.out.println(student);});
  */
		
   /* 6. to delete a particular id
	studentrepository.deleteById(2);
	System.out.println("deleted succesfully");
  */
	
	// to delete all the records
	Iterable<Student>ir=studentrepository.findAll();
	ir.forEach(student->{System.out.println(student);});
    studentrepository.deleteAll(ir);
        
	}

}
