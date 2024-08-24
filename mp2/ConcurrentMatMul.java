import java.util.Random;
import java.util.ArrayList;

public class ConcurrentMatMul {
	private int m1Dimensions;
	private int m2Dimensions;
	private ArrayList<ArrayList<Integer>> m1;
	private ArrayList<ArrayList<Integer>> m2;

	private void generateMatrices() {
		m1 = new ArrayList<ArrayList<Integer>>(m1Dimensions);
		m2 = new ArrayList<ArrayList<Integer>>(m2Dimensions);
		
		
	}

	private void populateMatrices(ArrayList<ArrayList<Integer>> m, int rows, int cols) {
		Random rand = new Random();
		for(int i = 0; i < rows; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>(cols);
			for(int j = 0; j < cols; j++) {
				row.set(j, rand.nextInt(10));
			}
			m.set(i, row);
		}
	}

	public ConcurrentMatMul(int m1Dimensions, int m2Dimensions) {
		this.m1Dimensions = m1Dimensions;
		this.m2Dimensions = m2Dimensions;
	}

	public ConcurrentMatMul() {
		this.m1Dimensions = 20;
		this.m2Dimensions = 20;
	}

	
}
