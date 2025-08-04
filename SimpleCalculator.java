import java.util.Scanner;
public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        double num1 , num2 , result;
        char Operation , choice ;
        
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter First Num. :- ");
            num1 = input.nextDouble();
            
            System.out.print("Enter Second Num. :- ");
            num2 = input.nextDouble();
       
            System.out.print("Please select the operation from '+' , '-' , '*' , '/' or '%' :- ");
            Operation = input.next().charAt(0);
    
            switch(Operation)
            {
                case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
    
                case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
    
                case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
    
                case '/': 
                if (num2 != 0)
                {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                else
                {
                    System.out.println("Error : Division by zero is not possible.");
                }
                break;
    
                case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
    
                default:
                System.out.println("Invalid Operation for this Calculator.");
                break;
            }
            System.out.print("Do you want to preform with another Operator ?  (y/n) :- ");
            choice  = input.next().charAt(0);
        }
        while(choice == 'y' | choice  == 'Y');
        
        input.close();
        System.out.println("Thank you for using this Calculator...");
    }
}