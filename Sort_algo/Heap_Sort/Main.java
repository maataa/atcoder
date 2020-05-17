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
            heapfy(l, n-1-i, n-1);
        }

        for(int i = 0; i < n; i++){
            heapfy(l, 0, n - 1 - i);
            int tmp = l[0];
            l[0] = l[n - 1 - i];
            l[n - 1 - i] = tmp;
        }

        for(int i = 0; i < n; i++){
            System.out.println(l[i] + " ");
        }
        sc.close();
    }
    static void heapfy(int[] l, int n, int m){
        if(2 * n + 1 > m) return;
        if(l[n] >= l[2 * n + 1]){
            if(2 * n + 2 > m) return;
            if(l[n] >= l[2 * n + 2]) {
                return;
            } else {
                int tmp = l[n];
                l[n] = l[2 * n + 2];
                l[2 * n + 2] = tmp;
                heapfy(l, 2 * n + 2, m);
            }
        } else{
            int tmp = l[n];
            l[n] = l[2 * n + 1];
            l[2 * n + 1] = tmp;
            heapfy(l, 2 * n + 1, m);
            heapfy(l, n, m);
        }
    }
}