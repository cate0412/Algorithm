import java.util.*;
class Solution {
    public String [] solution(String my_str, int n) {
        int k=0;
        if(my_str.length()%n==0){
             k = my_str.length()/n;
        }else{
             k = my_str.length()/n +1;
        }
        
        String [] answer = new String [k];
       
        for(int i=0; i<answer.length; i++){ 
            answer[i] =(i*n+n <= my_str.length()-1? 
                        my_str.substring(i*n,i*n+n) : 
                       my_str.substring(i*n));
                 
        }    
        return answer; 
    }
}