public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for ( int i = 0; i <= 10; i++) {
            System.out.println("Итерация: " + i);
        }
        int start = 10;
        while (start > 0) {
            System.out.println(start);
            start --;
        }
        int startingNumber = 0;
        boolean even = false;
        for (startingNumber = 0; startingNumber <= 17; startingNumber++) {
            if (startingNumber % 2 == 0) {
                even = true;
                System.out.println(startingNumber);
        }
        }
    }
}
