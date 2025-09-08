import java.util.Scanner;
  public class spy{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("enter n:");
    int n=scan.nextInt();
    int sum=0;int pro=1;
    while(n!=0)
    {
        int temp=n%10;
        sum+=temp;
        pro*=temp;
        n=n/10;
        
    }
    System.out.println("sum:"+sum);
    System.out.println("product:"+pro);
    if(sum==pro)
    {
      System.out.println("spy number");  
    }
    else{
        System.out.println("not spy number"); 
    }
  }}