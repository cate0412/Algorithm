class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int con =0;
        int unk =0;
        
        String [] s = polynomial.split("\\s\\+\\s");
        
        for(int i=0; i<s.length; ++i){
            if(s[i].matches("^[0-9]+$")){
                con+=Integer.parseInt(s[i]);
            }else if(s[i].equals("x")){
                unk+=1;
            }else if(s[i].contains("x")){
                unk+=Integer.parseInt(s[i].substring(0,s[i].length()-1));
            }
        }
        
        if(unk!=0 && con==0){
            if(unk==1) answer="x";
            else answer =unk + "x";
        }
       if(unk==0 && con!=0){
           answer=String.valueOf(con);
       }
        if(unk!=0 && con!=0){
            if(unk==1) answer ="x" + " + " +con;
            else answer= unk + "x" + " + " +con;
        }
        return answer;
    }
}