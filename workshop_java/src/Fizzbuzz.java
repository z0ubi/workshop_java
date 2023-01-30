public class Fizzbuzz {
    public static void main(String[]args) {
        int i = 0;
        while (i <= 200) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz\n");
            if (i % 5 == 0 && i % 3 != 0)
                System.out.println("Buzz\n");
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz\n");
            else
                System.out.print(i);
        }
    }
}
