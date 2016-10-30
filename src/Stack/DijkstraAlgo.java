package Stack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Stack;


public class DijkstraAlgo {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader  in = null;
		Stack<String> ops = new Stack<String>();
		Stack<Double> val = new Stack<Double>();
   	 	Double result = 0.0;
		try{
	          in = new FileReader ("C:/Users/BINH/Workspace_standard/Algorithm/src/Stack/input.txt");
          
	          int c = -1;
	          char[] OperandBuff = new char[1];
	          while ((c = in.read(OperandBuff)) != -1) {
	        	 String Operand = new String(OperandBuff, 0, 1);
	             /*Start process Dijkstra's two stack algorithm*/
	             /* Example:  (8*(6+4))-(4/(3+1))
	              * Step:
	              * Read one by one character C of input file
	              * 1 If C is operator then push in ops stack
	              * 2. Else if C is operand then push in val stack
	              * 3. Ignore Left parentheses
	              * 4. When encountering an right parentheses, then:
	              * 4.1: Pop 2 highest requisite number of operands from val stack
	              * 4.2: Pop 1 operator from ops stack and then apply this operator to these operands
	              * 4.3: Push back the result to val stack
	              * 
	              * */
	             if(Operand.equals("("));
	             else if(Operand.equals(" "));
	             else if(Operand.equals("+")||(Operand.equals("-"))||(Operand.equals("*"))||(Operand.equals("/"))) ops.push(Operand);
	             else if ((Operand.equals(")"))){
	            	 Double a = val.pop();
	            	 Double b = val.pop();
	            	 String opstr = ops.pop();
	            	 if(opstr.equals("+"))
	            		 result = a+b;
	            	 else if(opstr.equals("-")){
	            		 result = b-a; 
	            	 }
	            	 else if(opstr.equals("*")){
	            		 result = a*b; 
	            	 }
	            	 else if(opstr.equals("/")){
	            		 result = a/b; 
	            	 } 
	            	 val.push(result);
	            	 
	             }
	             else{
	            	 val.push(Double.parseDouble(Operand));
	            	 
	             }	                         
	             
	          }
	          
	          System.out.println(" " + result + " \n");

	       }finally {
	          if (in != null) {
	             in.close();
	          }
	       }
		

		
	}

}
