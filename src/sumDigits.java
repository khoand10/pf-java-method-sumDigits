import java.util.Scanner;

public class sumDigits {
    public static int sumDigits(int a){
        int total=0;
        do {
            total += a % 10;
            a /= 10;
        }while (a>0);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number Integer");
        int a = sc.nextInt();
        System.out.println(sumDigits(a));
    }
}
