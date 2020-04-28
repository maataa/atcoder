import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<num; i++){
            hs.add(sc.nextInt());
        }

        System.out.println(hs.size());

        sc.close();
    }
}