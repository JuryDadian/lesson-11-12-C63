import java.io.*;
import java.util.Arrays;

/**
 * @author Simon Pirko on 5.01.23
 */
public class Test {

	public static void main(String[] args) throws IOException {

//		try {
//			detectMaxMin("test.txt");
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

//		try {
//			FileOutputStream u = new FileOutputStream("test.txt");
//			u.write(new byte[]{72, 69, 76, 76, 79});
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

//		try {
//			FileInputStream i = new FileInputStream("test.txt");
//			byte[] arr = new byte[1000];
//			int read = i.read(arr);
//			System.out.println(read);
//			System.out.println(Arrays.toString(arr));
////			int temp;
////			while ((temp = i.read()) > 0) {
////				System.out.print((char) temp);
////			}
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

//		try {
//			FileReader reader = new FileReader("test.txt");
//			char[] arr = new char[1000];
//			int read = reader.read(arr);

//			FileWriter fileWriter = new FileWriter("test.txt", true);
//			fileWriter.write("Hello");
//			fileWriter.flush();
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
//			String line;
//			while ((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}

		File file = new File("text.txt");
		file.createNewFile();
	}

//	public static void copy(String name, String name2) throws IOException {
//		FileInputStream fileInputStream = new FileInputStream(name);
//		FileOutputStream fileOutputStream = new FileOutputStream(name2);
//
//		int b;
//		while ((b = fileInputStream.read()) > 0) {
//			fileOutputStream.write(b);
//		}
//
//		fileInputStream.close();
//		fileOutputStream.close();
//	}

//	public static void detectMaxMin(String name) throws IOException {
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
//
//		String line;
//		while ((line = bufferedReader.readLine()) != null) {
//			String[] s = line.split(" ");
//			for (String s1 : s) {
//				int number = Integer.parseInt(s1);
//				if (min > number) {
//					min = number;
//				}
//				if (max < number) {
//					max = number;
//				}
//			}
//		}
//		System.out.println("Min " + min);
//		System.out.println("Max " + max);
//	}
}
