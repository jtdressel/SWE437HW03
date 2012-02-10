//fmtRewrapTest.java
//James Dressel
import static org.junit.Assert.*;
import org.junit.Test;


public class fmtRewrapTest {
	
	String inputString;
	int width;
	String expected;

	@Test
	public void testFmtRewrapFox() {
		inputString = "fox";
		width = 30;
		expected = "fox\n";
		assertEquals(expected, fmtRewrap.fmtRewrap(inputString, width));
	}

}
