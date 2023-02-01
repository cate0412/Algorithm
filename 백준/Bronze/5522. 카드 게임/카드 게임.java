import java.util.*;
public class Main {
    public static void main(String args[])  {
        int answer =0;
        Scanner sc = new Scanner(System.in);
        int num [] = new int [5];
        
        for(int i=0; i<5; ++i){
             num[i]=sc.nextInt();
             answer+=num[i];
        }
        System.out.println(answer);
    }
}