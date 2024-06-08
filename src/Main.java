import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int[] paymentsCosts = {12_000, 15_000, 11_300, 10_200, 13_000};
        int sum = 0;
        for (int i = 0; i < paymentsCosts.length; i++) {
            sum = sum + paymentsCosts[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2.");
        int maxPaymentsCosts = -1;
        int minPaymentsCosts = 0;
        for (int i = 0; i < paymentsCosts.length; i++) {
            if (paymentsCosts[i] > maxPaymentsCosts) {
                maxPaymentsCosts = paymentsCosts[i];
            }
        }
        minPaymentsCosts = maxPaymentsCosts;
        for (int i = 0; i < paymentsCosts.length; i++) {
            if (paymentsCosts[i] < minPaymentsCosts) {
                minPaymentsCosts = paymentsCosts[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPaymentsCosts + " рублей. Максимальная сумма трат за неделю составила " + maxPaymentsCosts +  " рублей");

        System.out.println("Задание 3.");
        double[] newPaymentsCosts = {12_100, 15_050, 11_300, 10_200, 13_000};
        double newsum = 0;
        for (int i = 0; i < newPaymentsCosts.length; i++) {
            newsum = newsum + newPaymentsCosts[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + newsum/newPaymentsCosts.length + " рублей");

        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}