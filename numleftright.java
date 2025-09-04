import java.util.Scanner;
  public class numleftright{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int digit=0;
    int count=0;
    int a=n;
    while(n>0){
    n=n/10;
    count++;
    }
    int divisor=(int)Math.pow(10,count-1);
    while(divisor>0)
    {
      digit=(a/divisor)%10;
      System.out.print( digit);
      divisor=divisor/10;
    }

   n=n/10;
    }}