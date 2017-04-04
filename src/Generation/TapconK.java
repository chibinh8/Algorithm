package Generation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TapconK {
	
	private static List<Integer> getinput(){
		
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("C:/Users/BINH/Workspace_standard/Algorithm/src/Generation/input.txt");
		BufferedReader reader = null;
		
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;
		
		    while ((text = reader.readLine()) != null) {
		        list.add(Integer.parseInt(text));
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
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		/*Read input from file*/
			List<Integer> list =  new ArrayList<Integer>();
			List<Integer> listTapcon =  new ArrayList<Integer>();
			list = 	getinput();
			int n = list.get(0);
			int k = list.get(1);
			/*Sinh cau hinh khoi tao*/
			for(int i =1;i<=k;i++) 
				listTapcon.add(i);
			while(listTapcon.get(0)<(n-k)){
			int j=k-1;
			while(listTapcon.get(j)>=(n-k+j+1)) --j;
			int first = listTapcon.get(j)+1;
			listTapcon.set(j, first);
			for(int i =j+1;i<k;i++)  {
				int afterfirst = n-k+i+1;
				listTapcon.set(i, afterfirst);
			}
		
			for(int i:listTapcon) System.out.println(i+"");
	   }
	}

}
