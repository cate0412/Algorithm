import java.util.*;

public class Main {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sw = 0;

        for(int i=1; i<=n; i++){
            int input = sc.nextInt();
            System.out.print("Pairs for "+input+':');
            for(int j=1; j<input; j++){
                for(int k=j+1; k<input; k++){
                    if(j<k && j!=k && j+k==input && sw==0){
                        System.out.print(" "+j+" "+k);
                        sw=1;
                    }else if(j<k && j!=k && j+k==input &&sw==1){
                        System.out.print(", "+j+" "+k);

                    }
                }
            }
            sw=0;
            System.out.println();
        }
    }
}
