

public class Sumof10squareno
{
      
        public static void main (String[] args)
    {
        int i=1;
        int sum=0;
         do
        {
            int a=i*i;
             i++;
            sum = sum + a;
            }while(i<=10);
        
        System.out.println(""+sum);
           
}
}
