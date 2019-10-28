package deprecated;

public class SuppressWarningsTest {
	public static void main(String[] args) {
			
		   @SuppressWarnings("deprecation")
		   int[] values = new int[] {};
		   System.out.println(values);
	}
}
