
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
    int     hour;
    int     min;
    int     hourUsaStand;

    boolean am;

    String  strTime =  "Время в 12-часовом формате = ";

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите текущее время в 24-часовом формате");

    System.out.println("Часы: ");
    hour = sc.nextInt();

    System.out.println("Минуты: ");
    min = sc.nextInt();

    if (hour < 0 || hour > 23 || min < 0 || min >59)        // Проверка корректности времени: 0:00 - 23:59
    {
        System.out.println("Вы ввели некорректное значение времени");
        return;
    }

    am = (hour < 12);

    //Переводим в американский стандарт времени

    if (am)          //  до полудня (AM)
    {
        if(hour == 0)
            hourUsaStand = 12;      // 0:00 = 12:00 AM
        else
            hourUsaStand = hour;    // 1 - 11:00 = 1 - 11:00 AM

        strTime += hourUsaStand + ":" + min + " AM";
    }
else                        //  после полудня (PM)
    {
        if(hour == 12)
            hourUsaStand = 12;      // 12:00 = 12:00 PM
        else
            hourUsaStand = hour - 12; // 13 - 24:00 = 1 - 11:00 PM

        strTime += hourUsaStand + ":" + min + " PM";

    }

    System.out.println(strTime);

    }
}
