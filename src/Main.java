public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSpending = totalSpending + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Total monthly spending is " + totalSpending);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minDaySpending = 2_147_483_647;
        int maxDaySpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxDaySpending) {
                maxDaySpending = arr[i];
            }
            if (arr[i] < minDaySpending) {
                minDaySpending = arr[i];
            }
        }
        System.out.println("The minimum daily spending is " + minDaySpending + ". The maximum daily spending is " + maxDaySpending);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double totalSpending = 0;
        double averageMonthlySpending = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSpending = totalSpending + arr[i];
            System.out.println(arr[i]);
        }
        averageMonthlySpending = totalSpending / arr.length;
        System.out.println("The average monthly spending is " + averageMonthlySpending);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i] + " ");
        }
    }
}