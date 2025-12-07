import java.util.Scanner;

public class Multiplicationtable
{
      public static void main (String[] args)
        {
          Scanner scanner = new Scanner(System.in);      

            System.out.println("Enter which no you want multiplication of");
            int FirstInput = scanner.nextInt();   
            
            for(int i=1;i>=10;i++)
            
            {
                
                System.out.println(""+FirstInput + "+"+i+  "="+FirstInput*i);
            }
            
        }
}
