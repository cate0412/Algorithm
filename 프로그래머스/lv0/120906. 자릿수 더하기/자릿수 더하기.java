import java.util.*;

class Solution {
    public int solution(int n) {
        String [] arr = Integer.toString(n).split("");        
        int answer = 0;
        for(String a:arr){
            answer+= Integer.parseInt(a);
        }        
        
        return answer;
    }
}