package dependency_test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import student_reg.CourseProgramme;
import student_reg.Module;
import student_reg.Student;

public class DependencyTest {

	private Student student1 = new Student("Kevin", "03/11/97", "10001", 20);
	private Student student2 = new Student("Ian", "05/01/96", "10002", 21);
	private Student student3 = new Student("Joe", "22/04/98", "10003", 19);
	
	private Student student4 = new Student("Hannah", "03/11/97", "10004", 20);
	private Student student5 = new Student("Noel", "05/01/94", "10005", 23);
	private Student student6 = new Student("Stasis", "22/04/98", "10006", 19);
	
	private DateTime academicStartDate = new DateTime(2017, 3, 26, 12, 0);
	private DateTime academicEndDate = new DateTime(2017, 9, 26, 12, 0);

	private List<Student> programmingStudents = new ArrayList<Student>();
	private List<Student> softwareEngineeringStudents = new ArrayList<Student>();
	
	private Module programmingModule;
	private Module softwareEngineeringModule;
	
	private List<Module> modules = new ArrayList<Module>();

	private CourseProgramme courseProgramme;
	
	@Before
	public void setUp() {
		programmingStudents.add(student1);
		programmingStudents.add(student2);
		programmingStudents.add(student3);
		programmingModule = new Module("Programming IV", "CT404", programmingStudents, academicStartDate, academicEndDate);
		
		softwareEngineeringStudents.add(student4);
		softwareEngineeringStudents.add(student5);
		softwareEngineeringStudents.add(student6);
		softwareEngineeringModule = new Module("Software Engineering III", "CT405", softwareEngineeringStudents, academicStartDate, academicEndDate);
		
		modules.add(programmingModule);
		modules.add(softwareEngineeringModule);
		
		courseProgramme = new CourseProgramme("4BCT", modules);
	}
	
	@Test
	public void test() {
		System.out.println(courseProgramme.toString());
	}
}
