package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Student;
import in.nit.service.StudentService;

@Component
public class JdbcRunner implements CommandLineRunner {

	@Autowired
	private StudentService service;
	//@Override
	public void run(String... args) throws Exception {
	
		Student s1=new Student(13, "ramesh", "boot", 1000.0);
		
		String msg=service.saveStudent(s1);
        //String msg=service.updateStudent(s1);
      //  String msg=service.deleteStudent(11);
		System.out.println(msg);
		
	}

}
