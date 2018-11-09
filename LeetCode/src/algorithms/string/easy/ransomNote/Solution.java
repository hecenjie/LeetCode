package algorithms.string.easy.ransomNote;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0)
        	return true;
        int[] map = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
        	map[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
        	if(map[ransomNote.charAt(i)-'a'] == 0) {
        		return false;
        	} else {
        		map[ransomNote.charAt(i)-'a']--;
        	}
        }
        return true;
    }
}
