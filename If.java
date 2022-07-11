
public class If {
	public static void main(String[] args) {
		
		int a, b, c, d;
		
		a = 2;
		b = 3;
		
		System.out.println("a = 2, b = 3");
		if (a < b) System.out.println("a < b");
		if (a > b) System.out.println("never you see");
		
		System.out.println("");
		
		c = a - b;
		System.out.println("c = -1");
		if (c >= 0) System.out.println("c have +");
		
		if (c < 0) System.out.println("c have -");
		
		System.out.println("");
		
		d = b - a;
		System.out.println("d = 1");
		if (d >= 0) System.out.println("c have +");
		
		if (d < 0) System.out.println("c have -");
		
		System.out.println("");
		if (a + c != b) System.out.println("a + c don`t have b");
		if (a + c != b) System.out.println("a + d don`t have b");
	}

}
