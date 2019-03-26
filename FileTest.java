package Work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	
	public static void main(String []args) throws IOException {
		File file = new File("word.txt" );
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
			outputStream.write(buy);
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream inputStream = new FileInputStream(file);
		byte byt[] = new byte[1024];
		int len = inputStream.read(byt);
		System.out.print("文件中的信息是："+new String(byt,0,len));
		inputStream.close();
	 
	}

}
