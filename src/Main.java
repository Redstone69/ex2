public class Main {
    public static void main(String[] args) {

        double[] temps = {45, 29, 10, 22, 41, 28, 33};
        double[] prec = {95, 60, 25, 5, 0, 75, 90};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int count = 0; count < temps.length; count++) {
            if (temps[count] <= 32 && prec[count] > 50) {
                System.out.println(days[count] + " is likely to snow.");
            }
        }


    }
}
