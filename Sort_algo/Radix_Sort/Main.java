import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] l = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
            max = Math.max(max, l[i]);
        }
        int rank = 0;
        while(max != 0){
            max /= 10;
            rank++;
        }

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            al.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < rank; i++){
            for(int j = 0; j < n; j++){
                al.get(rankn(l[j], i)).add(l[j]);
            }
            convertion(l, al);
        }

        for(int i = 0; i < n; i++){
            if(i != n - 1){
                System.out.print(l[i] + " ");
            } else{
                System.out.println(l[i] + " ");
            }
        }

        sc.close();

    }

    static void clearelm(ArrayList<ArrayList<Integer>> al){
        int sz = al.size();
        al.clear();
        for(int i = 0; i < sz; i++){
            al.add(new ArrayList<Integer>());
        }
    }

    static void convertion(int[] l, ArrayList<ArrayList<Integer>> al){
        int sz = al.size();
        int i = 0;
        for(int j = 0; j < sz; j++){
            for(int k = 0; k < al.get(j).size(); k++){
                l[i] = al.get(j).get(k);
                i++;
            }
        }
        clearelm(al);
    }
    static int rankn(int k, int n){
        int put = 1;
        for(int i = 0; i < n; i++){
            put *= 10;
        }
        return((k/put)%10);
    }

}