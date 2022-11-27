package firstAssignment;

public class Recursion1 {

	private static int p(int count) {
		System.out.println("hello");
		if (count <= 1) {
			return count;
		}
		return p(count - 1);
	}

	public static void main(String[] args) {
		p(3);
	}

}
