import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        al.add(sc.nextInt());
        for(int i = 2; i < n + 1; i++){
            int in = sc.nextInt();
            for(int j = 0; j < al.size(); j++){
                if(al.get(j) > in){
                    al.add(j, in);
                    break;
                }
            }
            if(al.size() < i) al.add(in);
        }

        for(int i = 0; i < n; i++){
            System.out.println(al.get(i) + " ");
        }
        sc.close();
    }
}