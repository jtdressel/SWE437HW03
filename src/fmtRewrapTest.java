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
	
	@Test
	public void testFmtRewrapBox(){
		inputString = "box";
		width = 30;
		expected = "box\n";
		assertEquals(expected, fmtRewrap.fmtRewrap(inputString, width));
	}
	
	@Test
	public void testFmtRewrapLongSentence(){
		inputString = "This sentence is longer than the width so it should take multiple lines";
		width = 30;
		expected = "This sentence is longer than\nthe width so it should take\nmultiple lines\n";
		assertEquals(expected, fmtRewrap.fmtRewrap(inputString, width));
	}
	
	
	@Test
	public void testFmtRewrapWordLongerThanWidth(){
		inputString = "This sentence is longer than the width so it should take multiple lines";
		width = 5;
		expected = "This\nsentence\nis\nlonger\nthan\nthe\nwidth\nso\nit\nshould\ntake\nmultiple\nlines\n";
		assertEquals(expected, fmtRewrap.fmtRewrap(inputString, width));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testFmtRewrapZeroWidth(){
		inputString = "Fox";
		width = 0;
		fmtRewrap.fmtRewrap(inputString, width);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFmtRewrapNegativeWidth(){
		inputString = "Fox";
		width = -5;
		fmtRewrap.fmtRewrap(inputString, width);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFmtRewrapNullInput(){
		width = 5;
		fmtRewrap.fmtRewrap(null, width);
	}

}
