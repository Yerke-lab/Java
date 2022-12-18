import java.util.Arrays;

/**при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
        Пример входных данных:
        [1,2,3]
        Пример выходных данных:
        [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int count = factorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }
}