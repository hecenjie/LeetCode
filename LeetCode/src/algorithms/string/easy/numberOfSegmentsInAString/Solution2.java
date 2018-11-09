package algorithms.string.easy.numberOfSegmentsInAString;

public class Solution2 {
    public int countSegments(String s) {
    	if(s.length() == 0)
    		return 0;
    	int res = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' '))
    			res++;
    	}
    	return res;
    }
}
