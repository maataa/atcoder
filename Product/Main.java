import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in0 = sc.nextInt();
        int in1 = sc.nextInt();
        
        int sum = in0 * in1;
        if (sum%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}