import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int count=0;

        for (int a=0; a<A+1; a++) {
            for (int b=0; b<B+1; b++) {
                for (int c=0; c<C+1; c++) {
                    if(500*a+100*b+50*c==X){
                        count++;
                    } else {}
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}