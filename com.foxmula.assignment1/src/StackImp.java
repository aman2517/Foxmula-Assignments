import java.util.*;
public class StackImp
{
    //Driver code
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        int ch, data;
        StackImp si = new StackImp();
        {
            System.out.println("\n1. Push in Stack 1");
            System.out.println("\n2. Push in Stack 2");
            System.out.println("\n3. Pop in Stack 1");
            System.out.println("\n4. Pop in Stack 2");
            System.out.println("\nEnter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                s1.push(data);
                si.display(s1,s2);
                break;

                case 2:
                System.out.println("Enter the Data: ");
                data = sc.nextInt();
                s2.push(data);
                si.display(s1,s2);
                break;

                case 3:
                s1.pop();
                si.display(s1,s2);
                break;

                case 4:
                s2.pop();
                si.display(s1,s2);
                break;

                default:
                System.out.println("NULL");
                break;
            }
        }
    }
	public void display(Stack st1, Stack st2)
    {
        if(st1.count==st2.count)
        {
            System.out.println("Total number of elements in both stacks is : "+st2.count);
        }
    }
}