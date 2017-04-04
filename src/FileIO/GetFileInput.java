package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetFileInput {
	
	public static Integer[] ReadNumberfromFile(String path){
		Integer[] list = null;;
		int N = 0;
		File file = new File(path);
		BufferedReader reader = null;
		
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;
		    int i = 0;
		    if((text = reader.readLine()) != null) N = Integer.parseInt(text);
		    if(N>0){
		    	list = new Integer[N];
			    while ((text = reader.readLine()) != null) {
			    	list[i++]= Integer.parseInt(text);
			    }
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}	
		
		return list;
		
	}
}
