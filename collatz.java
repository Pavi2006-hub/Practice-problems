import java.util.Scanner;
  public class collatz{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("enter n:");
    int n=scan.nextInt();
    System.out.print(""+n);
    while(n!=1)
    {
      if(n%2==0)
      {
        n=n/2;
        
      }
      else{
        n=3*n+1;
      }
      System.out.print(","+n);
    }

  }}
