import java.util.Scanner;

public class PracticeA {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        String str = scan.next();

        System.out.print(x+y+z);
        System.out.println(" "+str);
        scan.close();
    }
}