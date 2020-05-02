import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] time = new int[N+1]; int[] x = new int[N+1]; int[] y = new int[N+1];
        time[0] = 0; x[0] = 0; y[0] = 0;

        for(int i = 0; i < N; i++){
            time[i+1] = sc.nextInt();
            x[i+1] = sc.nextInt();
            y[i+1] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(time[i+1]%2!=(x[i+1]+y[i+1])%2){
                System.out.println("No");
                sc.close();
                return;
            }
        }

        for(int i = 0; i < N; i++){
            int dis = Math.abs(x[i+1]-x[i])+ Math.abs(y[i+1]-y[i]);
            if((time[i+1]-time[i]) < dis){
                System.out.println("No");
                sc.close();
                return;
            }
        }

        System.out.println("Yes");
        sc.close();

    }
}