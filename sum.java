
  import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int temp;

        while (n > 0) {
            temp = n % 10;      // get last digit
            sum = sum + temp;   // add to sum
            n = n / 10;         // remove last digit
        }

        System.out.println("Sum is " + sum);  // print only once after loop
    }
}
