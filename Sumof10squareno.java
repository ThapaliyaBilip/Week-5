
/**
 * Write a description of class Sumof10squareno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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