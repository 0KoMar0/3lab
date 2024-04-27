import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int countPositive = 0;

        while(true) {
            int number = random.nextInt(100) - 50; // генерируем число из диапазона [-50; +49]
            System.out.println("Сгенерировано число: " + number);
            if (number > 0) {
                countPositive++;

                if (countPositive == 3) {
                    System.out.println("Было сгенерировано 3 положительных числа подряд.");
                    break;
                }
            } else {
                countPositive = 0;
            }
        }
    }
}