import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
public class Main{

public static void main(String[] args) {


        Random random = new Random();

        int[] expensesCompany = new int[30];
        for (int i = 0; i < expensesCompany.length; i++) {
            expensesCompany[i] = random.nextInt(100000) + 100000;
            System.out.print(expensesCompany[i] + " ");
        }
        System.out.println();
    // задание 1
    System.out.println("задание 1");

        int expensesTotal = 0;
    for (int i = 0; i < expensesCompany.length; i++) {
        expensesTotal += expensesCompany[i];
    }
    System.out.println("Сумма трат за месяц составила " + expensesTotal + " рублей");

    // задание 2
    System.out.println("задание 2");

    int maxExpenses = 0;
    for (int i = 0; i < expensesCompany.length; i++) {
        if (expensesCompany[i] > maxExpenses) {
        maxExpenses = expensesCompany[i];}
    }
    System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");

    int minExpenses = 200000;
    for (int i = 0; i < expensesCompany.length; i++) {
        if (expensesCompany[i] < minExpenses) {
            minExpenses = expensesCompany[i];}
    }
    System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");

    // задание 3
    System.out.println("задание 3");

    double averageExpenses = 0;
    for (int i = 0; i < expensesCompany.length; i++) {
        averageExpenses += expensesCompany[i];}
    averageExpenses /= expensesCompany.length;
    System.out.println("Средняя сумма трат за месяц составила " +averageExpenses + " рублей");

    // // задание 4
    System.out.println("задание 4");

    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    for (int i = reverseFullName.length - 1; i >= 0; i--) {
        System.out.print(reverseFullName[i]);
    }
}
}


