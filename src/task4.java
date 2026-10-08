public class task4 {
    public static void main(String[] args) {

        double sum1 = first();
        System.out.println("Результат первой суммы: "+ sum1);


        double sum2 = second();
        System.out.println("Результат второй суммы: "+ sum2);
    }

    public static double first()
    {
        double sum = 0.0;
        for (int i = 1; i <= 50; i++) {
            sum += 1.0 / Math.pow(i, 3);
        }
        return sum;
    }

    public static double second() {
        double sum = 0.0;
        for (int i = 2; i <= 128; i += 2) {
            sum += 1.0 / Math.pow(i, 2);
        }
        return sum;
    }
}
