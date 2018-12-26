import java.util.Scanner;

// Найти сумму всех n-значных чисел, кратных k (1 ≤ n ≤ 4).
public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 0, n = 0, p = 0;
        int s = 0;
        System.out.println("Введите число кратности");
        if (sc.hasNextInt())
            s = sc.nextInt();
        System.out.println("Введите число от 1 до 4");
        if (sc.hasNextInt())
            switch (m = sc.nextInt()) {
                case 1:
                    n = 10;
                    break;
                case 2:
                    n = 100;
                    break;
                case 3:
                    n = 1000;
                    break;
                case 4:
                    n = 10000;
                    break;
            }
        for (int i = 0; i <= n; i++) {
            if ((i % s) == 0) p = p + i;
        }

        System.out.println("Сумма всех чисел кратных " + s + " в диапазоне " + n + " = " + p);

    }
}




