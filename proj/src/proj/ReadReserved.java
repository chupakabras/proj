package proj;
import java.io.*;
import java.util.*;

//Reading the content of ReservedData.txt
public class ReadReserved {
	
	private Scanner f;
	
	public void openFile() {
		try {
			f = new Scanner(new File("ReservedData.txt"));
		}
		catch(Exception e) {
			System.out.println("An error has occured while trying to read data file.");
		}
	}
	
	public void closeFile() {
		f.close();
	}
	
	public int getNumberOfRows() {
		openFile();
		int rows = 0;
		while (f.hasNext()) {
			f.nextLine();
			rows++;
		}
		closeFile();
		openFile();
		return rows;
	}
	
	public String getLine() {
		String line = f.nextLine();
		return line;
	}
}