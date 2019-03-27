package Work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {
	public static void main(String[] args) throws IOException {
		String content[] = {"The Celtics","Won","Champion"};
		File file = new File("celtics.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for(int i=0;i<content.length;i++){
				bufferedWriter.write(content[i]);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String string = null;
			int i = 0;
			while((string=bufferedReader.readLine())!=null){
				System.out.println("µÚ"+i+"ÐÐ£º"+string);
				i++;
				
			}
			bufferedReader.close();
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
