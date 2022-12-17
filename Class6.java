package myJava15;

class Add implements Runnable{
	private int n;
	private int sum = 0;
	
	public Add(int a) {
		n = a;
	}
	public void run() {
		sum = (1+n)*n/2;
		System.out.println(sum);
	}
}

public class Class6 {

	public static void main(String[] args) {
		Add add = new Add(5);
		Thread a1 = new Thread(add);
		a1.start();
	}

}
