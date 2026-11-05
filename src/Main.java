import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] solution(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return new int[]{0};
        }

        int minCount = 0;
        int maxCount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isMin = true;
            boolean isMax = true;


            if (i > 0) {
                if (arr[i] >= arr[i - 1]){
                    isMin = false;
                }
                if (arr[i] <= arr[i - 1]){
                    isMax = false;
                }
            }


            if (i < n - 1) {
                if (arr[i] >= arr[i + 1]) isMin = false;
                if (arr[i] <= arr[i + 1]) isMax = false;
            }


            if (isMin) minCount++;
            if (isMax) maxCount++;
        }

        return new int[]{minCount, maxCount};
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));
        int[] res1 = solution(new int[] {1, 2, 3, 4});
        System.out.println("Результат -> Мин: " + res1[0] + ", Макс: " + res1[1]);

        System.out.println(Arrays.toString(new int[]{3, 2, 30, 4}));
        int[] res2 = solution(new int[] {3, 2, 30, 4});
        System.out.println("Результат -> Мин: " + res2[0] + ", Макс: " + res2[1]);

        System.out.println(Arrays.toString(new int[]{11, 0, 3, 9}));
        int[] res3 = solution(new int[] {11, 0, 3, 9});
        System.out.println("Результат -> Мин: " + res3[0] + ", Макс: " + res3[1]);


        System.out.println("ВВОДИ МАССИВ");
        int[] userArr = inputArray();
        int[] userResult = solution(userArr);
        System.out.println("Результат -> Мин: " + userResult[0] + ", Макс: " + userResult[1]);
    }
}
