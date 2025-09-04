import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int on = n;   // original number
        int arm = 0;  // to store sum of cubes

        while (n > 0) {
            int temp = n % 10;                 // get last digit
            arm = arm + (int)Math.pow(temp, 3); // cube and add
            n = n / 10;                        // remove last digit
        }

        if (arm == on) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
