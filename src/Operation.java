import java.util.Objects;

/**
 * @author Simon Pirko on 5.01.23
 */
public class Operation {
	private double num1;
	private double num2;
	private double result;

	private String type;

	public Operation() {
	}

	public Operation(double num1, double num2, String type) {
		this.num1 = num1;
		this.num2 = num2;
		this.type = type;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Operation operation = (Operation) o;
		return Double.compare(operation.num1, num1) == 0 && Double.compare(operation.num2, num2) == 0 && Double.compare(operation.result, result) == 0 && Objects.equals(type, operation.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num1, num2, result, type);
	}

	@Override
	public String toString() {
		return "Operation{" +
				"num1=" + num1 +
				", num2=" + num2 +
				", result=" + result +
				", type='" + type + '\'' +
				'}';
	}
}
