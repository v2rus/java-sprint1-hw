class MonthData {
    int[] days = new int[30];

    void printSteps(int day){
        System.out.println(days[day-1]);
    }
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < 30; i++) {
            System.out.println("За день "+i+" пройденно "+days[i]+" шагов");
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps=sumSteps+days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i]<=maxSteps){
                maxSteps=days[i];
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
                finalSeries++;
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
