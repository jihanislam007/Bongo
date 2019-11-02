import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramTest {

	@Test
	public void anagramTest() {

		Anagram anagramTest = new Anagram();
		
		String s1 = "dcba";
		String s2 = "abcd";
		
		boolean ans = anagramTest.isAnagram(s1,s2);
		
		Assert.assertEquals(true, ans);
		
		s1 = "bbbb";
		s2 = "aaaa";
		
		ans = anagramTest.isAnagram(s1,s2);		
		Assert.assertEquals(false, ans);
		
	}

}
