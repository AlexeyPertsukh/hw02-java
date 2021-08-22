
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
	// write your code here
    int a, b, c;
    int min;
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите целое число А:");
    a = sc.nextInt();

    System.out.println("Введите целое число B:");
    b = sc.nextInt();

    System.out.println("Введите целое число C:");
    c = sc.nextInt();

    min = a;
    min = (b < min) ? b : min;
    min = (c < min) ? c : min;

    System.out.println("Минимальное число: " + min);
    }
}
