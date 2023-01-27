import java.util.*;
public class Main {
    public static void main (String args[]){
       int king=1;
       int queen =1;
       int rook =2;
       int bishop=2;
       int night =2;
       int pawn = 8;

       Scanner sc = new Scanner (System.in);

       king = king - sc.nextInt();
       queen = queen - sc.nextInt();
       rook = rook- sc.nextInt();
       bishop = bishop - sc.nextInt();
       night = night -sc.nextInt();
       pawn = pawn -sc.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(night + " ");
        System.out.print(pawn + " ");

    }
}
