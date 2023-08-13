import java.util.Scanner;

public class StepTracker {


    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void printMonthSteps() {
        System.out.println("введите номер месяца от 1 до 12");
        int month = scanner.nextInt();
        System.out.println("введите номер дня: ");
        int day = scanner.nextInt();
        MonthData monthData = monthToData[month-1];
        monthData.printSteps(day);

    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца
        int steps = 0;
        int day = 0;
        int month = scanner.nextInt();
        if ((month>0)&&(month<13)){
            System.out.println("Введите день от 1 до 30 (включительно)");
            day = scanner.nextInt();
            if ((day>0)&&(day<31)){
                System.out.println("Введите количество шагов");
                // ввод и проверка количества шагов
                steps = scanner.nextInt();
            }else System.out.println("Попробуйте снова, допустимые значения от 1 до 30");
        }else System.out.println("Попробуйте снова, допустимые значения от 1 до 12");

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month-1];

        // Сохранение полученных данных
        monthData.days[day-1] = steps;
        System.out.println(monthData.days[day-1]);
    }


//    void changeStepGoal(int newGoalByStepsPerDay){
//        goalByStepsPerDay = newGoalByStepsPerDay;
//    }
//    void printStatistic() {
//        System.out.println("Введите число месяца");
//        // ввод и проверка номера месяца
//
//        int month = scanner.nextInt();// получение соответствующего месяца
//        //проверить введенный номер месяца
//
//        int sumSteps = monthToData[month].sumSteps();// получение суммы шагов за месяц
//
//

        // вывод общей статистики по дням

                // вывод суммы шагов за месяц
                // вывод максимального пройденного количества шагов за месяц
                // вывод среднего пройденного количества шагов за месяц
                // вывод пройденной за месяц дистанции в км
                // вывод количества сожжённых килокалорий за месяц
                // вывод лучшей серии
                //дополнительный перенос строки
    }
//}
