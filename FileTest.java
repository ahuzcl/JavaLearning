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
			byte buy[] = "����һֻСë¿���Ҵ���Ҳ���".getBytes();
			outputStream.write(buy);
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream inputStream = new FileInputStream(file);
		byte byt[] = new byte[1024];
		int len = inputStream.read(byt);
		System.out.print("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
		inputStream.close();
	 
	}

}
