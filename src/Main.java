public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myHeight = 1.9; // рост в метрах
        double myWeight = 85.0; // вес в килограммах

        int myBmi = service.calculate(myHeight, myWeight);

        System.out.println("BMI = " + myBmi);
    }
}
