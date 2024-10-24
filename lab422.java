import java.util.Scanner;
public class lab422{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        int current = begin;
        int count = 0;
        while (current <= end){
            if (current % 2 ==0){
                count++;

            }
            current++;
        }
        System.out.println(count);
    }
}