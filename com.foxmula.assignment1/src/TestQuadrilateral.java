import java.util.Scanner;
public class TestQuadrilateral
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Square: ");
        Square sq=new Square(sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),
                sc.nextFloat(),sc.nextFloat());
        System.out.println("Area Of The Square is " + sq.area());

        System.out.println("Enter coordinates for Rectangle: ");
        Rectangle rec=new Rectangle(sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),
                sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println("Area Of The Rectangle is " + rec.area());

        System.out.println("Enter coordinates for Parallelogram: ");
        Parallelogram p=new Parallelogram(sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),
                sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(), sc.nextFloat());
        System.out.println("Area Of The Parallelogram is " + p.area());

        System.out.println("Enter coordinates for Trapezoid: ");
        Trapezoid t=new Trapezoid(sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),
                sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(), sc.nextFloat());
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}