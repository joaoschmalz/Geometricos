public class Pyramid
{
	public double height;
	public double baseHeight;
	public double baseWidth;

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getBaseHeight()
	{
		return baseHeight;
	}

	public void setBaseHeight(double baseHeight)
	{
		this.baseHeight = baseHeight;
	}

	public double getBaseWidth()
	{
		return baseWidth;
	}

	public void setBaseWidth(double baseWidth)
	{
		this.baseWidth = baseWidth;
	}

	public double getVolume()
	{
		return ((this.baseHeight * this.baseWidth) * this.height) /3;
	}
}
