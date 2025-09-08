import java.util.Scanner;
  public class niven{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("enter n:");
    int n=scan.nextInt();
    int sum=0;
    int temp=n;
   while(temp!=0)
    {
    sum=sum+(temp%10);
    temp=temp/10;
    }

    
    if(n%sum==0)
    {
        System.out.print("naiven");
    }
    else{
        System.out.print(" not naiven");
    }}

  }