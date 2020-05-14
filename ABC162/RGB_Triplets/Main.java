import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char[] cha = s.toCharArray();
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> g = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(cha[i] == 'R'){
                r.add(i);
            } else if(cha[i] == 'G'){
                g.add(i);
            } else{
                b.add(i);
            }
        }
        
        System.out.println(
            bigger(r, g, b) + bigger(r, b, g) + bigger(b, r, g)
                + bigger(b, g, r) + bigger(g, r, b) + bigger(g, b, r));
    }
    static int bigger(ArrayList<Integer> l, ArrayList<Integer> m, ArrayList<Integer> n){
        int out = 0;
        for(int i = 0; i < l.size(); i++){
            int lv = l.get(i);
            for(int j = 0; j < m.size(); j++){
                if(lv < m.get(j)) {
                    for()
                } 
            }
        }
        return out;
    }
}