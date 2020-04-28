import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        if (in==0) {
            System.out.println(in);
        } else if (in%3==1) {
            System.out.println(1);
        } else if (in%3==2) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        sc.close();
    }
}