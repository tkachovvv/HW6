public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация: " + i);
        }
        int start = 10;
        while (start > 0) {
            System.out.println(start);
            start--;
        }
        int startingNumber = 0;
        boolean even = false;
        for (startingNumber = 0; startingNumber <= 17; startingNumber++) {
            if (startingNumber % 2 == 0) {
                even = true;
                System.out.println(startingNumber);
            }
        }
        int countDown = 10;
        while (countDown >= -10) {
            System.out.println("Обратный отсчет: " + countDown);
            countDown--;
        }
        for (int year = 1906; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Високосный год :" + year);
            }
        }
        for (int sNumber = 7; sNumber <= 98; sNumber = sNumber + 7) {
            System.out.println(sNumber);
        }
        for (int geometricalProgression = 1; geometricalProgression <= 512; geometricalProgression = geometricalProgression *2) {
            System.out.println(geometricalProgression);
        }
        int installment = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + installment;
            System.out.println("Месяц " + month + " Итого " + total);
        }
        int installmentPlan = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings = totalSavings + (installmentPlan / 100) * 12;
            totalSavings = totalSavings + installmentPlan;
            System.out.println("Месяц " + month + " Итого " + totalSavings);
        }
    }
}

