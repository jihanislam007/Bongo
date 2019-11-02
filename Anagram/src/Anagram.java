import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String firstString, String secondString) {

		firstString = firstString.replace(" ", "");
		secondString = secondString.replace(" ", "");

		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();

		char[] firstStringArray = firstString.toCharArray();
		char[] secondStringArray = secondString.toCharArray();

		Arrays.sort(firstStringArray);
		Arrays.sort(secondStringArray);

		boolean result = Arrays.equals(firstStringArray, secondStringArray);

		return result;

	}

}
