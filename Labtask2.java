import java.util.Scanner;
public class Labtask2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n=sc.nextInt();
    int i=1;
    while(i<=n)
    {
      System.out.print("*");
      i++;
    }
                         
  }
}