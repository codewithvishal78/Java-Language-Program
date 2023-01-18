import java.util.Scanner;

public class ifelse {
   public static void main(String[] args) {
       System.out.print("enter the number to check the even or odd:-");
       Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
       if(x%2==0)
       {
           System.out.println(x+" is even number");
       }
       else{
       System.out.println(x+" is odd number");
       }
   }
}
