import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("enter a number:-");
        Scanner sc= new Scanner(System.in);
        int button=sc.nextInt();
       
       /* if(button==1)
        {
            System.out.println("hello");
        }
        else if(button==2)
        {
                System.err.println("namaste");
        }
        else if(button==3)
         {
                System.out.println("bangure");
         }
         else{
             System.out.println("invalid");
         }*/

         switch(button)
         {
             case 1:
             {
                 System.out.println("hello");
                 break;
             }
             case 2:
             {
                 System.out.println("namaste");
                 break;
             }
             case 3:
             {
                 System.out.println("hii");
                 break;
             }
             default:
             {
                 System.out.println("please enter valid number");
             }
         }
        }
    }
    

