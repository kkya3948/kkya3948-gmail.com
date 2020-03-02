package in.nit.service;

import in.nit.model.Student;

public interface StudentService {

	String saveStudent(Student s);
	String updateStudent(Student s);
	String deleteStudent(Integer id);
}
