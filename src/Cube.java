public class Cube
{
	public double edge;

	public double getEdge()
	{
		return edge;
	}

	public void setEdge(double edge)
	{
		this.edge = edge;
	}

	public double getVolume()
	{
		return Math.pow(this.edge, 3);
	}
}
