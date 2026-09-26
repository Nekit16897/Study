import java.util.Scanner;

public class gf {


    public static void main(String[] args) {
        double[] x = new double[3];
        double[] y = new double[3];

        vvodDannih(x, y);

        double[] otvet = naitiChetvertuyTochku(x, y);
        vivodRezultata(otvet);
    }

    public static void vvodDannih(double[] x, double[] y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты трех точек прямоугольника через пробел:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Точка " + (i + 1) + ": ");
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
    }

    public static double[] naitiChetvertuyTochku(double[] x, double[] y) {
        double d01 = (x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]);
        double d02 = (x[0] - x[2]) * (x[0] - x[2]) + (y[0] - y[2]) * (y[0] - y[2]);
        double d12 = (x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]);
        double x4 = 0;
        double y4 = 0;

        if (d01 + d02 == d12) {

            x4 = x[1] + x[2] - x[0];
            y4 = y[1] + y[2] - y[0];
        } else if (d01 + d12 == d02) {

            x4 = x[0] + x[2] - x[1];
            y4 = y[0] + y[2] - y[1];
        } else {

            x4 = x[0] + x[1] - x[2];
            y4 = y[0] + y[1] - y[2];
        }


        double[] rez = new double[2];
        rez[0] = x4;
        rez[1] = y4;
        return rez;
    }


    public static void vivodRezultata(double[] otvet) {
        System.out.println("Координаты четвертой вершины:");
        System.out.println("X = " + otvet[0]);
        System.out.println("Y = " + otvet[1]);
    }
}
