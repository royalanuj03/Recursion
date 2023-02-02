 //   print decreasing and increasing 
import java.util.*;
public class r3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }
//  Expectation 5,4,3,2,1,1,2,3,4,5
//  Faith 4,3,2,1,1,2,3,4
    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}