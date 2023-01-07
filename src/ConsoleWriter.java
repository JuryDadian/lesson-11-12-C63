/**
 * @author Simon Pirko on 5.01.23
 */
public class ConsoleWriter implements Writer {
	@Override
	public void write(String message) {
		System.out.println(message);
	}
}
