import java.util.Scanner;

class Calculator {
	private String name;
	
	public Calculator() {
		this.name = "No name assigned";
	}

	public Calculator(String name) {
		this.name = name;
	}
	
	public float addition(float a, float b) {
		return a + b;
	}

	public float subtraction(float a, float b) {
		return a - b;
	}

	public float multiplication(float a, float b) {
		return a * b;
	}

	public void setname(String N) {
		this.name = N;
	}

	public String getname() {
		return this.name;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator mycalc = new Calculator();
		Scanner scan = new Scanner(System.in);
		mycalc.setname("Group 5");
		System.out.printf("Welcome to the Calculator designed by %s\n", mycalc.getname());
		String op = "";
		while(op != "Q") {
			System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
			try {	
				op = scan.next().toUpperCase();
				if(!op.equals("A") && !op.equals("S") && !op.equals("M") && !op.equals("Q")) {
					throw new IllegalArgumentException();
				}
				float v1;
				float v2;
				if(op.equals("A")) {
					System.out.println("Enter argument 1");
					v1 = Float.parseFloat(scan.next());
					System.out.println("Enter argument 2");
					v2 = Float.parseFloat(scan.next());
					System.out.printf("The sum of argument 1 and argument 2 is %f\n\n", mycalc.addition(v1, v2));
				} else if(op.equals("S")) {
					System.out.println("Enter argument 1");
                                        v1 = Float.parseFloat(scan.next());
                                        System.out.println("Enter argument 2");
                                        v2 = Float.parseFloat(scan.next());
                                        System.out.printf("The difference of argument 1 and argument 2 is %f\n\n", mycalc.subtraction(v1, v2));
				} else if(op.equals("M")) {
					System.out.println("Enter argument 1");
                                        v1 = Float.parseFloat(scan.next());
                                        System.out.println("Enter argument 2");
                                        v2 = Float.parseFloat(scan.next());
                                        System.out.printf("The product of argument 1 and argument 2 is %f\n\n", mycalc.multiplication(v1, v2));
				} else if(op.equals("Q")) {
					break;
				} else {
					throw new IllegalArgumentException();
				}
								
			}
			catch(Exception e) {
				System.out.println("Invalid input.");
			}
		}
	}
}
