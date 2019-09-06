package studentdriver;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//Peter Johnson


public class DriverLicenseQualifiedTest {
	DriverLicenseQualified dLQ = new DriverLicenseQualified();
	StudentDriver studentdriver = new StudentDriver("Annette");
	
	 	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPassedTest() {
		studentdriver.setCalculateStudentScore(88);
		assertTrue(dLQ.passedTest(studentdriver));
		
	}
	
	@Test
	public void testNotPassedTest() {
		studentdriver.setCalculateStudentScore(74);
		assertFalse(dLQ.passedTest(studentdriver));
	}
	
    @Test
    public void testGetState() {
    	String expectedState = "IA";
    	assertEquals(expectedState, studentdriver.getState());
    }
    
    @Test
    public void testCalculateStudentScore() {
    	studentdriver.setTestQuestionsMissed(17);
    	int score = dLQ.calculateStudentScore(studentdriver);
    	assertEquals(83, score);
    }

}
