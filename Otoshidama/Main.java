import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int a=-1; int b=-1; int c=-1;

        for(int x=0; x<N+1; x++){
            for(int y=0; y<N-x+1; y++){
                int z = N-x-y;
                if(x*10000+y*5000+z*1000==Y&&z>=0){
                        a=x; b=y; c=z; break;
                    } else {}
            }
        }

        System.out.println(String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c));

        sc.close();

    }
}