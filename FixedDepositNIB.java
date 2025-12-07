import java.util.Scanner;

public class FixedDepositNIB
{
        public static void main (String[] args)
        {
             Scanner scanner = new Scanner(System.in);     
             
            System.out.print("Enter deposit amount (minimum 1000): ");
            double P = scanner.nextDouble();
            
            System.out.print("Enter annual interest rate (8–12): ");
            double AnnualRate = scanner.nextDouble();
            
            System.out.print("Enter aDuration rate (1-5): ");
            double years = scanner.nextDouble();
            
            if(P<1000)
            {
            System.out.println("You did not keep the minimum amount or Your time frame is high");
            }
             
            if(AnnualRate < 8 || AnnualRate > 12)
            {
               System.out.println("Please keep Intrest rate with in range");

            }
             if(AnnualRate < 1 || AnnualRate > 5)
            {
               System.out.println("we don't allow FD to exceed 5 years and below 1 year");

            }
            
            double Months = years * 12;
            double MonthlyRate = (AnnualRate/100) / 12;
            double A = P * Math.pow((1 + MonthlyRate), Months);
            double FeeRate = 0.5 ; 
            double Fee = A * FeeRate;
            double FinalAmount = A - Fee;
             
            
            System.out.println("--- results-----------------\n");
            System.out.println("The principle is:"+P);
            System.out.println("AnnualRate:"+AnnualRate);
            System.out.println("Duration(in years):"+years);
            System.out.println("Duration(in Month)"+Months);
            System.out.println("Maturity amount (before fee)"+A);
            System.out.println("Processing fee(0.5%):"+Fee);
            System.out.println("Final Amount Received:"+FinalAmount);
            System.out.println("----------------------------\n");
            }
}