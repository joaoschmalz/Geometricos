public class Cylinder
{
	public double radius;
	public double height;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getVolume()
	{
		return 3.14 * Math.pow(this.radius, 2) * this.height;
	}
}
