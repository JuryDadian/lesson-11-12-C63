import java.util.Scanner;

/**
 * @author Simon Pirko on 5.01.23
 */
public class ConsolerReader implements Reader {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public String readString() {
		return scanner.next();
	}

	@Override
	public Double readDouble() {
		return scanner.nextDouble();
	}
}
