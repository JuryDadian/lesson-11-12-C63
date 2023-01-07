import java.io.*;

/**
 * @author Simon Pirko on 5.01.23
 */
public class ConsoleApplication implements Application {

	private final Reader reader = new ConsolerReader();
	private final FileWriter fileWriter;

	{
		try {
			fileWriter = new FileWriter("history.txt", true);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private final Writer writer = new ConsoleWriter();
	private final Calculator calculator = new Calculator();

	@Override
	public void run() {
		checkFile();
		while (true) {
			writer.write("Enter number 1");
			double num1 = reader.readDouble();
			writer.write("Enter number 2");
			double num2 = reader.readDouble();
			writer.write("Enter operation type");
			String type = reader.readString();
			Operation operation = new Operation(num1, num2, type);
			Operation result = calculator.calculate(operation);
			try {
				fileWriter.write(result.toString());
				fileWriter.write("\n"); // добавил для перевода на новую строку в файле history
				fileWriter.flush();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			writer.write("Result " + result);
			//some code

			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					writer.write(line);
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private void checkFile() {
		File file = new File("history.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
