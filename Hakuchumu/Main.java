import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str_ = sc.nextLine();
        StringBuilder str = new StringBuilder(str_);
        StringBuilder strrev = str.reverse();

        int len = str.length();
        int para = 0;

        String Dr = "remaerd"; String D = "maerd"; String Er = "resare"; String E = "esare";

        while(para<len){
            if(strrev.indexOf(D, para)==para||strrev.indexOf(E, para)==para){
                para += 5;
            } else if(strrev.indexOf(Er, para)==para){
                para +=6;
            } else if(strrev.indexOf(Dr, para)==para){
                para +=7;
            } else {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}