import java.util.Arrays;

public class Home {

	public static void main(String[] args) {

		Anagram anagram = new Anagram();
		
		String firstString = "Dcba";
		String secondString = "abCd";

		boolean result = anagram.isAnagram(firstString,secondString);

		if (result == true) {

			System.out.println("Data is Anagram");

		} else {
			System.out.println("Data is not Anagram");

		}

	}

}
