import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(l[j] > l[j+1]){
                    int tmp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = tmp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(l[i] + " ");
        }

        sc.close();
    }
}