import java.util.*;
public class TestTreeMap {
	public static void main(String[]args)
	{
		Object a1 = new LinkedList(),b1 = new TreeSet();
		Object c1 = new TreeMap();
		System.out.println((a1 instanceof Collection)+",");
		System.out.println((b1 instanceof Collection)+",");
		System.out.println(c1 instanceof Collection);
	}
}
