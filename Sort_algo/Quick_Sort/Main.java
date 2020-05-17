import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }

        quick_sort(l, 0, n - 1);

        for(int i = 0; i < n; i++){
            System.out.println(l[i] + " ");
        }

        sc.close();


    }
    static void quick_sort(int[] d, int s, int t){
        if(s >= t) return;

        int pt = d[(s + t) / 2];
        int l = s, r = t, tmp;
        while(l <= r){
            while(d[l] < pt) {l++;}
            while(d[r] > pt) {r--;}
            if(l <= r){
                tmp = d[l]; 
                d[l] = d[r]; 
                d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, s, r);
        quick_sort(d, l, t);
    }
}