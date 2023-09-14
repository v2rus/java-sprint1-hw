import java.util.Scanner;

public class StepTracker {


    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца
        int steps;
        int day;
        int month = scanner.nextInt();
        if ((month>0)&&(month<13)){
            System.out.println("Введите день от 1 до 30 (включительно)");
            day = scanner.nextInt();
            if ((day>0)&&(day<31)){
                System.out.println("Введите количество шагов");
                // ввод и проверка количества шагов
                steps = scanner.nextInt();
                if (steps<0){
                    System.out.println("Вы ввели недопустимое или отрицательное значение");
                    return;
                }
            }else {
                System.out.println("Попробуйте снова, допустимые значения от 1 до 30");
                return;
            }
        }else {
            System.out.println("Попробуйте снова, допустимые значения от 1 до 12");
            return;
        }
        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month-1];
        // Сохранение полученных данных
        monthData.days[day-1] = steps;
    }


    void changeStepGoal(){
        int newGoalByStepsPerDya = 0;
        System.out.println("Введите новую цель по число шагов: ");
        newGoalByStepsPerDya = scanner.nextInt();
        if (newGoalByStepsPerDya<0){
            System.out.println("Вы ввели недопустимое или отрицательное значение");
        }else {
            goalByStepsPerDay = newGoalByStepsPerDya;
            System.out.println("Новая суточная цель шагов = " +goalByStepsPerDay);
        }

    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        // ввод и проверка номера месяца
        int month = scanner.nextInt();
        if ((month >0)&&(month<13)) {
            // получение соответствующего месяца
            MonthData monthData = monthToData[month - 1];
            // получение суммы шагов за месяц
            int sumSteps = monthData.sumStepsFromMonth();
            // вывод общей статистики по дням
            System.out.println("Общая статистика по дням:");
            monthData.printDaysAndStepsFromMonth();
            // вывод суммы шагов за месяц
            System.out.println("Всего пройдено шагов " + sumSteps);
            // вывод максимального пройденного количества шагов за месяц
            int[] maxSteps = monthData.maxSteps();
            System.out.println("Максимальное пройденное количество шагов в месяце за день " + (maxSteps[0]+1) + " равняется " + maxSteps[1]);
            // вывод среднего пройденного количества шагов за месяц
            double averageSteps = ((double) sumSteps)/30;
            System.out.println("Среднеее количество пройденных шагов за месяц: " + averageSteps);
            // вывод пройденной за месяц дистанции в км
            System.out.println("Пройденная дистанция (в км) "+ converter.convertToKm(sumSteps));
            // вывод количества сожжённых килокалорий за месяц
            System.out.println("Количество сожжённых килокалорий "+ converter.convertStepsToKilocalories(sumSteps));
            // вывод лучшей серии
            int bestSeries = monthData.bestSeries(goalByStepsPerDay);
            System.out.println("Лучшая серия " + bestSeries);
            System.out.println(); //дополнительный перенос строки
        } else {
            System.out.println("Вы ввели недопустимо значение. Допустимые значение от 1 до 12");
            return;
        }
    }
}