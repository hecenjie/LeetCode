package algorithms.string.longestSubstringWithoutRepeatingCharacters;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
		System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
		System.out.println(solution.lengthOfLongestSubstring("abca"));
		System.out.println(solution.lengthOfLongestSubstring("aabca"));
	}
}
