package assignment;

public class PrintNumbers {
	static void print(int num) {
		printUtill(1, 10);
	}

	static void printUtill(int start, int end) {
		if (start > end)
			return;
		System.out.print(start + ",");
		printUtill(start + 1, end - 1);
		System.out.print(end + ",");

	}

	public static void main(String args[]) throws InterruptedException {
		print(10);
	}
}