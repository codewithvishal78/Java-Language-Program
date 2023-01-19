import java.util.Scanner;

public class patternsquare 
{
    public static void main(String[] args)
    {
        int i,j,n;
        //n=number of row
        //m=number of colomn
        System.out.println("enter n :-");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        //outer loop
        for(i=1;i<=n;i++)
        {
            //enner loop
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }   
    }
}
/* output type
   ****
   ****
   ****
   **** 
 */