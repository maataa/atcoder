import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int out = 0;

        for (;in>0; in--) {
            int in5 = (in/10000)%10;
            int in4 = (in/1000)%10;
            int in3 = (in/100)%10;
            int in2 = (in/10)%10;
            int in1 = in%10;

            if (A-1<in5+in4+in3+in2+in1&&in5+in4+in3+in2+in1<B+1) {
                out = out + in;
            } else {}
        }

        System.out.println(out);

        sc.close();
    }
}