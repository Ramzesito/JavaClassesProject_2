public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        return (int) (weightInKilograms / Math.pow(heightInMeters, 2));
    }
}
