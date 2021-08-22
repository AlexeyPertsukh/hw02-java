
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
	// write your code here
    int num;

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите целое число:");

    num = sc.nextInt();

    if(num % 2 == 0)
        System.out.println("Четное число");
    else
        System.out.println("Нечетное число");

    }
}
