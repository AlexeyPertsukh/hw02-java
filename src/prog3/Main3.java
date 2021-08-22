import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
	// write your code here

    int     fingerNum;
    String  fingerName;

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите номер пальца на руке:");
    fingerNum = sc.nextInt();

    if(fingerNum < 1)  //проверка корректности номера пальца
    {
        System.out.println("Пальца с таким номером не бывает.");
        return;
    }

     switch (fingerNum)
     {
         case 1:
             fingerName= "Это большой палец";
             break;
         case 2:
             fingerName= "Это указательный палец";
             break;
         case 3:
             fingerName= "Это средний палец";
             break;
         case 4:
             fingerName= "Это безымянный палец";
             break;
         case 5:
             fingerName= "Это мизинец";
             break;
         default:
             fingerName= "Иногда на руке бывает больше 5 пальцев, но собственных названий для них нет";
             break;
     }

    System.out.println(fingerName);

    }
}
