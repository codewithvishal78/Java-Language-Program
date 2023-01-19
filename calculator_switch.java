import java.util.Scanner;

public class calculator_switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an operator +,-,*,/,%");
        char opt = sc.next().charAt(0);
        System.out.println("enter a first number:-");
        float a = sc.nextFloat();
        System.out.println("enter a second number:-");
        float b = sc.nextFloat();
       
        switch(opt)
        {
            case '+':
            {
                
                System.out.println(a+b);
                break;
            }
            case '-':
            {
                System.out.println(a-b);
                break;
            }
            case '*':
            {
                System.err.println(a*b);
                break;
            }
            case '/':
            {
                System.err.println(a/b);
                break;
            }
            case '%':
            {
                System.err.println(a%b);
                break;
            }
            default:
            {
                System.out.println("enter valid opt");
            }
        }


    }   
}
