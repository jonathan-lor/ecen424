public class Main {
	public static void main(String[] args) {
		System.out.println("Hello from main");
		ConcurrentMatMul ccmm = new ConcurrentMatMul();
		ccmm.printMatrices();

		MatMulThread mmt = new MatMulThread();
		mmt.start();
		// mmt.run();
	}
}
