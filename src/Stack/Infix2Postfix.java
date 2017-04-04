package Stack;

import java.io.FileReader;
import java.io.IOException;

public class Infix2Postfix {
	
	public void Evaluate (char[] Posfix) {
		for(char c: Posfix){
			
		}
		
	}
    								
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader  in = null;
		Stack<String> Soperator = new Stack<String>();
		try{
	        in = new FileReader ("C:/Users/BINH/Workspace_standard/Algorithm/src/Stack/input.txt");
		    int c = -1;
		    char[] OperandBuff = new char[1];
	        while ((c = in.read(OperandBuff)) != -1) {
	      	 String sInString = new String(OperandBuff, 0, 1);
	      	 if(sInString.equals(" ")||sInString.equals("("));
	      	else if(sInString.equals("+")||(sInString.equals("-"))||(sInString.equals("*"))||(sInString.equals("/"))){
	      		Soperator.push(sInString);
	      	 }
	      	else if(sInString.equals(")")){
	      		
	      		System.out.println(" " + Soperator.pop().item);
	      	}else{
	      		
	      		System.out.println(" " + sInString);
	      	}	      		 
	       }		
		}
		finally {
	          if (in != null) {
		             in.close();
		      }			
		}

	    
	}

}
