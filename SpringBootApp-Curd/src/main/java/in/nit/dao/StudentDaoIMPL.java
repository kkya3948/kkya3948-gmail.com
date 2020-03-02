package in.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.nit.model.Student;
@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int saveStudent(Student s) {
		String sql="insert into Student values(?,?,?,?,?)";
		
		return jt.update(sql, s.getSid(),s.getSname(),s.getSfee(),s.getCourse(),s.getDiscount());
		
	}

	@Override
	public int updateStudent(Student s) {
		String sql="update student set sname=?,sfee=?,course=? where sid=?";
		return jt.update(sql, s.getSname(),s.getSfee(),s.getCourse(),s.getSid());
	}

  public int deleteStudent(Integer id) {
	String sql="delete from student where sid=?";
	int count=jt.update(sql,id);
	return count;
}
}
