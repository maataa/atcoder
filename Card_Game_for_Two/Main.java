import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pnum = (num-1)%2;
        int[] num_box = new int[num];
        
        for(int i=0; i<num; i++){
            num_box[i] = sc.nextInt();
        }

        Arrays.sort(num_box);

        int dif=0;

        for(int i=num-1; i>=0; i--){
            if(i%2==pnum){
                dif=dif+num_box[i];
            } else{
                dif=dif-num_box[i];
            }
        }

        System.out.println(dif);

        sc.close();
    }
}
