PK
    ;m\X�-�  �  (   JUnit_Test_Lab3/src/GradeBookTester.javaimport static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		fail("Not yet implemented");
		gradeBook1.addScore(75);
        gradeBook1.addScore(85);
        gradeBook1.addScore(95);
        assertEquals("75.0 85.0 95.0 0.0 0.0", gradeBook1.toString());
        assertEquals(3, gradeBook1.getScoreSize());
	}

	@Test
	void testSum() {
		fail("Not yet implemented");
		    gradeBook1.addScore(75);
	        gradeBook1.addScore(85);
	        gradeBook1.addScore(95);
	        assertEquals(255, gradeBook1.sum());
	}

	@Test
	void testMinimum() {
		fail("Not yet implemented");
		gradeBook1.addScore(75);
        gradeBook1.addScore(85);
        gradeBook1.addScore(95);
        assertEquals(75, gradeBook1.minimum());
	}

	@Test
	void testFinalScore() {
		fail("Not yet implemented");
		gradeBook1.addScore(75);
        gradeBook1.addScore(85);
        gradeBook1.addScore(95);
        assertEquals(175, gradeBook1.finalScore());
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}
	
	void testAddScoreLimit() {
		fail("Not yet implemented");
	}
	
	void testMinimumEmptyGradeBook() {
		fail("Not yet implemented");
	}
	
	 void testFinalScoreEmptyGradeBook() {
		 fail("Not yet implemented");
	 }
	

}
PK
 
    ;m\X�-�  �  (                 JUnit_Test_Lab3/src/GradeBookTester.javaPK      V   @    