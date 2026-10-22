import java.util.Scanner;

public final class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        if (Math.abs(x) >= 1) {
            System.out.println("Ошибка");
            return;
        }
        System.out.print("Введите количество слагаемых n: ");
        int n = scanner.nextInt();
        System.out.print("Введите точность e: ");
        double e = scanner.nextDouble();

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        double a = 1.0;
        int k = 0;


        while (k < n || Math.abs(a) > e / 10) {
            if (k < n) {
                sum1 += a;
            }

            if (Math.abs(a) > e) {
                sum2 += a;
            }
            if (Math.abs(a) > e / 10) {
                sum3 += a;
            }

            k++;
            a = a * (- (2.0 * k - 3.0) / (2.0 * k) * x);
        }


        double mathResult = Math.sqrt(1 + x);



        System.out.println("Сумма первых слагаемых "+ n+ sum1);
        System.out.println("Сумма слагаемых > e "+ sum2);
        System.out.println("Сумма слагаемых > e/10 "+ sum3);
        System.out.println("Значение функции "+ mathResult);


    }
}
