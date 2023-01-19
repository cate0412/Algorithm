class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^1-9]","");
        String [] arr = s.split("");
        for(String i:arr)
            answer +=Integer.parseInt(i);
        return answer;
    }
}