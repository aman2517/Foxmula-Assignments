public class Rectangle extends Quadrilateral
{
	Rectangle(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		setCoordinate(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	double area()
	{
		double d1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double d2=Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}