public class Main
{
	public static void main(String[] args)
	{
		Cube c = new Cube();
		Cylinder cl = new Cylinder();
		Sphere s = new Sphere();
		Pyramid p = new Pyramid();

		c.edge = 2;
		cl.height = 3;
		cl.radius = 2;
		s.radius = 2;
		p.height = 3;
		p.baseWidth = 2;
		p.baseHeight = 2;

		System.out.println(c.getVolume());
		System.out.println(cl.getVolume());
		System.out.println(s.getVolume());
		System.out.println(p.getVolume());
	}
}
