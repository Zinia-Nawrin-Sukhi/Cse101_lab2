import java.util.Scanner;
public class Task99
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
      int row=sc.nextInt();
    int rownum=1;
    while(rownum<=row)
    {
      int starcount=1;
      while(starcount<=rownum)
      {
        System.out.print("*");
        starcount++;
      }
      System.out.println();
      rownum++;
    }
  }
}