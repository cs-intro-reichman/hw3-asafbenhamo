import javax.print.DocFlavor.STRING;

/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		// Replace the following statement with your code
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		String s = "";
	    String s1 = "";
		int i = 0;
		while (str2.length()>0) {
			char c = str1.charAt(i);
			if(str2.indexOf(c)== -1) return false;
			else{
				s = str2.substring(0, i);
				s1 = str2.substring(i, str2.length());
				str2 = s + s1;
			}
			i++;
		}
		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		str = str.toLowerCase();
		String s = "";
		String letter = "qwertyuioplkjhgfdsazxcvbnm";
		for(int i = 0; i< str.length(); i++){
			char c = str.charAt(i);
			if ( letter.indexOf(c) != -1){
            s = s + c;
			}

			
		}
		return s;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
		str = preProcess(str);
		String s = "";
		String v = "";
		char o;
		for(int i = 0; i< str.length(); i++){
			char c = str.charAt(i);
			if ( str.indexOf(c) != -1){
            s = s + c;
			}
		}
			if (str == s){
            o = s.charAt(0);
            v = s.substring(1, s.length());
		    s = v + o ;
			}
			if (isAnagram(str, s)== true){
				return s;
			}
			return s;
		}
	
	

	}