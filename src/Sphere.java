public class Sphere
{
	public double radius;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getVolume(){
		return (double) 4/3 * 3.14 * Math.pow(this.radius,3);
	}
}
