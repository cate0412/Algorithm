import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int [10000];
        int j=0;
        for(int num : numlist){
            if(num%n==0){
            answer[j]+=num;
                j++;
            }
        }
        int [] answer2 =new int [j];
        for(int i=0; i<j; i++){
            answer2[i]+=answer[i];
        }
      
        return answer2;
    }
}