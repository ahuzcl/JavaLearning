package Work;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("filetest.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		while(true){
			String string = scanner.nextLine();
			bufferedWriter.write(string);
			bufferedWriter.newLine();
			
			if(string.equals("done")){
				break;
			}
		}
		bufferedWriter.close();
		fileWriter.close();

 
		
	}

}
