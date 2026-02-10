package regression;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import backend.entities.WordAnalyzer;
import junit.framework.Assert;

public class FirstRepededCharicterBug {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WordAnalyzer wa = new WordAnalyzer("mate");
		char result = wa.firstRepeatedCharacter();
		Assert.assertEquals(0,result);
	}

}
