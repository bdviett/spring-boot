package jdbc;


import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	//init database
	public void setDataSource(DataSource ds);

	//create record in Student
	public void create(String name, Integer age);

	//return object student from student id
	public Student getStudent(Integer id);
	
	//get all student from database
	public List<Student> listStudent();
	
	//delete student from student_id
	public void delete(Integer id);
	
	//update student from student_id
	public void update(Integer id, Integer age);
	
}
