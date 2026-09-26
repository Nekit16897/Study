import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод исходных данных
        System.out.print("Введи скорость 1 авто: ");
        double v1 = scanner.nextDouble();

        System.out.print("Введи cкорость 2 авто: ");
        double v2 = scanner.nextDouble();

        System.out.print("Введи ускорение 1 авто: ");
        double a1 = scanner.nextDouble();

        System.out.print("Введи ускорение 2 авто: ");
        double a2 = scanner.nextDouble();

        System.out.print("Введи расстояние между ними: ");
        double s = scanner.nextDouble();

        double sum = 0;
        int hours = 0;
        if (v1<=0 || v2<=0 || s<=0){
            System.out.println("Ты дурак");
            return;
        }
        while (sum<s){
            sum += v1+v2;
            v1+=a1;
            v2+=a2;
            hours+=1;

        }


        System.out.println("Автомобили встретятся через " + hours+ " часа");
    }
}
