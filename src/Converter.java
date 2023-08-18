public class Converter {
    double convertToKm(int steps){
        double km = (((double) steps) * 0.75)/1000;
        return km;
    }
    double convertStepsToKilocalories(int steps){
        double kilocalories = (steps * 50)/1000;
        return kilocalories;
    }
}
