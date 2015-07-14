public class LongestPalindrom {

	public static void main(String[] args) {
		String str = "my dad calls my mom madam";
		String longestPalFound = null; // To record longest found palindrome											
		int longestPalLength = 0; // To record its length
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // Current character

			// Ignore space character
			if (ch != ' ') {

				// Find next occurrence index of current character 'ch' from
				// current index + 1
				// If next occurrence of 'ch' doesn't exist, then nextOccIndex =
				// -1
				int nextOccIndex = str.indexOf(ch, i + 1);

				// If next occurrence of 'ch' exists (i.e nextOccIndex > -1),
				// then we can test whether the substring between current index
				// and next occurrence index is palindrome or not,
				// But since we're only concerned about longest palindrome,
				// we can avoid palindrome test for those substrings whose
				// length is smaller than the captured so far as 'longestPalLength'
				if (nextOccIndex > -1 && (nextOccIndex + 1 - i) > longestPalLength) {
					String sub = str.substring(i, nextOccIndex + 1);
					
					//Test if substring is palindrome 
					if (isPalindrome(sub)) {
						longestPalFound = sub; //Record this palindrome string as the longest found so far
						longestPalLength = sub.length(); //Also record its length
						//System.out.println(sub);
					}
				}
			}
		}

		System.out.println(longestPalFound + " is the longest palindrom");
	}

	
	/**
	 * Method to test whether a given String is palindrome or not.
	 * 
	 * @param str String to be tested
	 * @return true if string is palindrome, false otherwise
	 */
	private static boolean isPalindrome(String str) {
		int len = str.length();
		int begin = 0, end = len - 1;
		int mid = (begin + end) / 2;
		int i = 0;
		for (i = begin; i <= mid && str.charAt(begin) == str.charAt(end); i++) {
			begin++;
			end--;
		}
		if (i == mid + 1)
			return true;

		return false;
	}
}
