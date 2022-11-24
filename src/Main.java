public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        // Задача 1

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");

        // Задача 2

        int max = 1;
        int min= 300000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min= arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задача 3

        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double averageSum = total / arr.length;
        System.out.println(averageSum);

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "" ;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            result += reverseFullName[i];
        }
        System.out.println(result);
    }
}

