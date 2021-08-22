import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
	// write your code here

    double  userWeight;
    int     userExerciseProfile;
    double  userDayProteinGr = 0;
    boolean userExerciseProfileCorrect = true;

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите свой вес: ");
    userWeight = sc.nextDouble();

    System.out.println("Введите профиль физической активности: ");
    System.out.println("1- Сидячий образ жизни с незначительной физической активностью. Хотите сохранить свой вес. ");
    System.out.println("2- Работа с физическим трудом, 2-3 тренировки в неделю на развитие выносливости.");
    System.out.println("3- Силовые тренировки, хотите увеличит мышечную массу или силу. ");
    userExerciseProfile = sc.nextInt();


    switch (userExerciseProfile)
    {
        case 1:
            userDayProteinGr = 1.2;
            break;
        case 2:
            userDayProteinGr = 1.6;
            break;
        case 3:
            userDayProteinGr = 2;
            break;
        default:
            userExerciseProfileCorrect = false;
            break;
    }

    if(userExerciseProfileCorrect)      //проверка корректности выбранного профиля
    {
        System.out.println("Вы должны употреблять " + userWeight * userDayProteinGr + " грамм белка в день");
    }
    else
    {
        System.out.println("Вы ввели некорректный профиль. Запустите программу снова. ");
    }

    }
}
