package in.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.StudentDao;
import in.nit.model.Student;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Override
	public String saveStudent(Student s) {
		
		s.setDiscount(s.getSfee()*5/100);
		int count=dao.saveStudent(s);
		if(count==0)
			return "record not inserted";
		else
			return "record inserted";
		
	}

	@Override
	public String updateStudent(Student s) {
		int count=0;
		if(s.getSname().length()>=6) {
			s.setSname(s.getSname());
		 count=dao.updateStudent(s);
		}
		else
			System.out.println("name should be greter then 6 char");
		if(count==0)
			return "record not updated";
		else
		return "record updated";
	}
	@Override
	public String deleteStudent(Integer id) {
		int count= dao.deleteStudent(id);
		if(count==0)
			return "record not deleted";
		else
		return "record deleted";
	}

}
