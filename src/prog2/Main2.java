

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
	// write your code here
    int     residentMaritalStatus;
    double  residentTaxRate = 0;
    double  residentRevenue;


    Scanner sc = new Scanner(System.in);

    System.out.println("Введите семейный статус");
    System.out.println("1-один субьект, 2-семейная пара, 3-родитель одиночка:");
    residentMaritalStatus = sc.nextInt();

    if(residentMaritalStatus < 1 || residentMaritalStatus > 3)  //проверка корректности семейного статуса
    {
        System.out.println("Вы ввели неправильный семейный статус, запустите программу еще раз");
        return;
    }

    System.out.println("Введите годовой доход $:");
    residentRevenue = sc.nextDouble();

    if(residentRevenue < 0)     //проверка корректности годового дохода
    {
        System.out.println("Доход не может быть отрицательным, если вы погрязли в долгах, просто введите 0.");
        System.out.println("Запустите программу еще раз");
        return;
    }

    if(residentMaritalStatus == 1)  //налоговая ставка для одиночек
    {
        if(residentRevenue < 9076)
           residentTaxRate = 10;   //10%

        else if(residentRevenue >= 9075 && residentRevenue < 36901)
           residentTaxRate = 15;   //15%

        else if(residentRevenue >= 36901 && residentRevenue < 89351)
            residentTaxRate = 25;   //25%

        else if(residentRevenue >= 89351 && residentRevenue < 186351)
            residentTaxRate = 28;   //28%

        else if(residentRevenue >= 186351 && residentRevenue < 405101)
            residentTaxRate = 33;   //33%

        else if(residentRevenue >= 405101 && residentRevenue < 406751)
            residentTaxRate = 35;   //35%
        else
            residentTaxRate = 39.6;   //39.6%
    }
    else if(residentMaritalStatus == 2)  //налоговая ставка для семейной пары
    {
        if(residentRevenue < 18151)
            residentTaxRate = 10;   //10%

        else if(residentRevenue >= 18151 && residentRevenue < 73801)
            residentTaxRate = 15;   //15%

        else if(residentRevenue >= 73801 && residentRevenue < 148851)
            residentTaxRate = 25;   //25%

        else if(residentRevenue >= 148851 && residentRevenue < 226851)
            residentTaxRate = 28;   //28%

        else if(residentRevenue >= 226851 && residentRevenue < 405101 )
            residentTaxRate = 33;   //33%

        else if(residentRevenue >= 405101 && residentRevenue < 457601)
            residentTaxRate = 35;   //35%
        else
            residentTaxRate = 39.6;   //39.6%
    }
    else if(residentMaritalStatus == 3)  //налоговая ставка для родитьеля-одиночки
    {
        if(residentRevenue < 12951)
            residentTaxRate = 10;   //10%

        else if(residentRevenue >= 12951 && residentRevenue < 49401)
            residentTaxRate = 15;   //15%

        else if(residentRevenue >= 49401 && residentRevenue < 127551)
            residentTaxRate = 25;   //25%

        else if(residentRevenue >= 127551 && residentRevenue < 206601)
            residentTaxRate = 28;   //28%

        else if(residentRevenue >= 206601 && residentRevenue < 405101)
            residentTaxRate = 33;   //33%

        else if(residentRevenue >= 405101 && residentRevenue < 432201)
            residentTaxRate = 35;   //35%
        else
            residentTaxRate = 39.6;   //39.6%
    }

        System.out.println("Ваша налоговая ставка: " + residentTaxRate + "%");
        System.out.println("Ваш налог: " + (residentRevenue / 100) * residentTaxRate );

    }
}
