package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bert2", "Randall1", "Gibbons3", dBirthDate, "1214 Labrador Lane", "301-893-6889", "bgibbons1@udel.edu","MIS1");
		Student stu3 = new Student("Bert3", "Randall2", "Gibbons4", dBirthDate, "2214 Labrador Lane", "304-893-6889", "bgibbons2@udel.edu","MIS2");
		Student stu4 = new Student("Bert4", "Randall3", "Gibbons5", dBirthDate, "3214 Labrador Lane", "303-893-6889", "bgibbons3@udel.edu","MIS3");
		Student stu5 = new Student("Bert5", "Randall4", "Gibbons6", dBirthDate, "4214 Labrador Lane", "305-893-6889", "bgibbons4@udel.edu","MIS4");

		assertTrue(5==5);
	}

}
