package set1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("C:\\Users\\Shresth Verma\\eclipse-workspace\\Practice set 1\\TEXT");
		BufferedReader textReader= new BufferedReader(fr);
		String arr=textReader.readLine();
		System.out.println(arr);
		int[] ch= new int[arr.length()];
		for (int i = 0; i < arr.length(); i++) {
			ch[i]=arr.charAt(i);
		}
		for(int c:ch) {
			
			System.out.println(c);
		}
	}

}
