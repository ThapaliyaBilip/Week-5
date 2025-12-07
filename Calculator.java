import java.util.Scanner;


public class Calculator
{
    public static void main (String[] args)
        {
             Scanner scanner = new Scanner(System.in);      
             
             System.out.println("Enter the 1st number");
            int FirstInput = scanner.nextInt(); 
            
             System.out.println("Enter the 1st number");
            int SecondInput = scanner.nextInt(); 
            
            
            System.out.println("press A for +");
            System.out.println("press B for -");
            System.out.println("Press C for +");
            System.out.println("Press D for *");
            System.out.println("Press E for %");
         
            String choice = scanner.next();  
            switch (choice.toUpperCase()) {
        case "A":
            System.out.println("FirstInput"+FirstInput+"+" +SecondInput+ "=" +FirstInput+SecondInput); 
            break;
        case "B":
             System.out.println(FirstInput + " - " + SecondInput + " = " + (FirstInput - SecondInput));  
            break;
        case "C":
            System.out.println("FirstInput"+FirstInput+"/" +SecondInput+ "=" + +FirstInput/SecondInput);
            break; 
        case "D":
            System.out.println("FirstInput"+FirstInput+"%" +SecondInput+ "="+FirstInput%SecondInput);
        case "E":
            System.out.println("FirstInput"+FirstInput+ "*" +SecondInput+ "=" +FirstInput*SecondInput) ;
     
        default:
            System.out.println("Wrong data type");
            break;
            
            
        }
}
}

