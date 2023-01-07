/**
 * @author Simon Pirko on 5.01.23
 */
public class Calculator {

	public Operation calculate(Operation operation) {
		switch (operation.getType()) {
			case "sum":
				operation.setResult(sum(operation.getNum1(), operation.getNum2()));
				return operation;
			case "sub":
				operation.setResult(sub(operation.getNum1(), operation.getNum2()));
				return operation;
			case "mult":
				operation.setResult(mult(operation.getNum1(), operation.getNum2()));
				return operation;
			case "div":
				operation.setResult(div(operation.getNum1(), operation.getNum2()));
				return operation;
		}
		return null;
	}

	private static double sum(double a, double b) {
		return a + b;
	}

	private static double sub(double a, double b) {
		return a - b;
	}

	private static double mult(double a, double b) { return a * b; }

	private static double div(double a, double b) { return a / b; }
}
