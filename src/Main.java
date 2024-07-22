public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Task 3
        System.out.println("Task 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        //Task 4
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 5
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4)
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }

        //Task 6
        System.out.println("Task 6");
        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        //Task 7
        System.out.println("Task 7");
        for (int i = 1; i < 1000; i *= 2) {
            System.out.println(i);
        }

        //Task 8
        System.out.println("Task 8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 9
        System.out.println("Task 9");
        int salary = 29000;
        int totalAmount = 0;
        for (int i = 1; i <= 12; i++) {
            totalAmount += totalAmount/100;
            totalAmount += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAmount + " рублей");
        }

        //Task 10
        System.out.println("Task 10");
        int count;
        for (int i = 1; i < 11; i++) {
            count = 2 * i;
            System.out.println("2 * " + i + " = " + count);
        }
    }
}