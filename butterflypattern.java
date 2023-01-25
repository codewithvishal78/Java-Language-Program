import java.util.Scanner;

public class butterflypattern {
    public static void main(String[] args) {
      
         int i,j,k;
         System.out.println("enter the n number");
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
             k=n-i;
             for(j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             for(j=1;j<=2*k;j++)
             {
              System.out.print(" ");
             }
             for(j=1;j<=i;j++)
             {
              System.out.print("*");
             }
             System.out.print("\n");
         }
     
     
         for(i=n;i>=1;i--)
         {
             k=n-i;
             for(j=1;j<=i;j++)
             {
              System.out.print("*");
             }
             for(j=1;j<=2*k;j++)
             {
              System.out.print(" ");
             }
             for(j=1;j<=i;j++)
             {
              System.out.print("*");
             }
             System.out.print("\n");
         }
    }
  }
  