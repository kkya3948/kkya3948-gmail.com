package in.nit.dao;

import in.nit.model.Student;

public interface StudentDao {
	
	int saveStudent(Student s);//insert record
	int updateStudent(Student s);//update record
	int deleteStudent(Integer id);//delete record

}
