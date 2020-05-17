import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }

        MergeSort(l);

        for(int i = 0; i < n; i++){
            System.out.println(l[i] + " ");
        }

        sc.close();


    }
    static void MergeSort(int[] l){
        if(l.length == 1) return;

        int pt = l.length/2;
        int[] left = new int[pt];
        int[] right = new int[l.length - pt];

        for(int i = 0; i < left.length; i++){
            left[i] = l[i];
        }
        for(int j = 0; j < right.length; j++){
            right[j] = l[pt + j];
        }

        MergeSort(left);
        MergeSort(right);

        Merge(l, left, right);
    }
    static void Merge(int[] p, int[] l, int[] r){
        int i = 0;
        int j = 0;
        for(int k = 0; k < p.length; k++){
            if(i < l.length){
                if(j < r.length){
                    if(l[i] < r[j]){
                        p[k] = l[i];
                        i++;
                    } else{
                        p[k] = r[j];
                        j++;
                    }
                } else{
                    p[k] = l[i];
                    i++;
                }
            } else{
                p[k] = r[j];
                j++;
            }
        }
    }
}