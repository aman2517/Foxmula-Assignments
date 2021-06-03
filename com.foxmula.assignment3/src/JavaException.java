import java.util.Scanner;

class PrimeOddException extends Exception{
    public PrimeOddException(String message) {
        System.out.println(message);
    }
}
public class JavaException {
    public static void main(String[] args){
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        number=Integer.parseInt(sc.nextLine());
        try{
            if(number<=1)
                return;
            for(int i=2;i<number;i++)
                if(number%i==0)
                    return;
            throw new PrimeOddException("Number is invalid");
            }
        catch (PrimeOddException primeOddException) {
            System.out.println("Error caught: "+primeOddException);
        }
    }
}

