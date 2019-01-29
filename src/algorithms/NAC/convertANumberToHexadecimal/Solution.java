package algorithms.NAC.convertANumberToHexadecimal;

public class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        String res = "";
        int compare = 15;
        while(num != 0) {
        	res = map[(compare & num)] + res;
        	num = num >>> 4;
        }
        return res;
    }
}
