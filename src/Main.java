import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        StepTracker user = new StepTracker(scanner);
        while (true) {
            System.out.println("Введите команду: ");

            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                // здесь будет логика команды 1
                user.addNewNumberStepsPerDay();
            } else if (i == 2) {
            // здесь будет логика команды 2
                user.changeStepGoal();
            } else if (i == 3) {
            // здесь будет логика команды 3
                user.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                break;
            } else {
                System.out.println("Такой команды нет");
            }

        }
    }

    private static void printMenu() {
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("4 - выйти из приложения");
    }
}
