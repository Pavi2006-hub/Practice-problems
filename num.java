import java.util.Scanner;
  public class num{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int dig=0;
    while(n>0){
    dig=n%10;
   System.out.print(dig+"");
     n=n/10;}}}