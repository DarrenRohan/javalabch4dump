import java.util.Scanner;

public class lab423{
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (i < 5) {
            int num = sc.nextInt();
            total += num;
            i+= 1;
        }
        System.out.println("Total is "+ total);
        
    }
}