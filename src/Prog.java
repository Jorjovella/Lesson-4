import java.util.Scanner;

public class Prog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задание 9 (Четное или Нечетное)
        System.out.println("Number: ");
        int number = scanner.nextInt();
        if (number%2 == 0)
        {
            System.out.println("Even");
        }else
            {
                System.out.println("Odd");
            }

        // Задание 10 (Дни недели)
        System.out.println("Day(1-7): ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
                case 2:System.out.println("Вторник");
                    break;
            case 3:System.out.println("Среда");
                break;
            case 4:System.out.println("Четверг");
                break;
            case 5:System.out.println("Пятница");
                break;
            case 6:System.out.println("Суббота");
                break;
            case 7:System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Выход за границы");

        }
    }
}
