import java.util.Scanner;

public class neon{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        scan.close();

        int q = n * n;   // square
        int sum = 0;

        while(q != 0) {
            sum += q % 10;  // add last digit
            q = q / 10;     // remove last digit
        }

        if(sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
