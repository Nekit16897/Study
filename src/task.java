import java.util.Scanner;

public final class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        if (Math.abs(x) > 1) {
            System.out.println("Баран, читай условие лучше");
            return;
        }
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        double sum1 = 1;
        double sum2 = 0;
        double sum3 = 0;
        double ratio = 1;
        for (int i = 1; i<=n-1;i++){
            if (i%2!=0){
                ratio=Math.abs(ratio);

                ratio=ratio * Math.pow(x,i)* ((double) i /(i*2)) ;

                sum1+=ratio;
            }
            else if (i%2==0){

                ratio = ratio*((double) 1 /(2*i))*Math.pow(x,i);
                ratio*=-1;

                sum1+=ratio;

            }
            if (Math.abs(ratio)>e){
                sum2+=ratio;
            }
            if (Math.abs(ratio)>e/10){
                sum3=ratio;
            }
        }


        System.out.println("Сумма n первых слагаемых "+  sum1);
        System.out.println("Сумма слагаемых >e "+  sum2);
        System.out.println("Сумма первых слагаемых >e/10 "+  sum3);
        System.out.println("Значение функции "+  Math.sqrt(1+x));


    }
}
