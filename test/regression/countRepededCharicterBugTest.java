package regression;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import backend.entities.WordAnalyzer;
import junit.framework.Assert;

public class countRepededCharicterBugTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WordAnalyzer wa = new WordAnalyzer("aabbcdaaaabb");
		int result = wa.countRepeatedCharacters();
		Assert.assertEquals(3,result);
	}

}
