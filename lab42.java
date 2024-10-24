import java.util.Scanner;

public class lab42 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int div = 2;
    int flag = 1;
    while (div < num) {
        if (num % div == 0){
            flag = 0;
            System.out.println("Not Prime Number");
            break;
                            }        
        div++;
                        }
        if (flag == 1)
        System.out.println("Prime number");
        
    }
}
