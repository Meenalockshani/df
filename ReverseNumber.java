import java.util.Scanner;
 
public class ReverseNumber
{
   public static void main(String args[])
   {
      int num, rev = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner input = new Scanner(System.in);
      num = input.nextInt();
 
      while( num != 0 )
      {
          rev= rev * 10;
          rev = rev + num%10;
          num = num/10;
      }
 
      System.out.println("Reverse of entered number is "+rev);
   }
}                
