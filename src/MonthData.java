class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // Вывод элементов массива в необходимом формате
            System.out.println((i+1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps=sumSteps+days[i];
        }
        return sumSteps;
    }

    int[] maxSteps() {
        int[] maxSteps = new int[2];
        for (int i = 0; i < days.length; i++) {
            if (days[i]>=maxSteps[1]){
                maxSteps[0] = i;
                maxSteps[1] = days[i];

            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимальной серии
            if (days[i]>=goalByStepsPerDay){
                currentSeries++;
                if (currentSeries>finalSeries){
                    finalSeries = currentSeries;
                }
            } else currentSeries = 0;
        }
        return finalSeries;
    }
    int sumSteps (){
        int sumStepsResult = 0;
        for (int i = 0; i<days.length; i++){
            sumStepsResult = sumStepsResult +days[i];
        }return sumStepsResult;
    }
}
