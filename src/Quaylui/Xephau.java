package Quaylui;

import FileIO.GetFileInput;

public class Xephau {
	Integer[] listnum = null;
	Integer[][] Toado = null;
	int N=0;
	boolean[] CheoDBTN = null;
	boolean[] CheTBDN = null;
	boolean[] Cot =null;
	public Xephau(String path){
		
		listnum = GetFileInput.ReadNumberfromFile(path);
		for(int i:listnum) System.out.println(i+"");
		if(listnum!=null){
			N = listnum[0];
			CheoDBTN = new boolean[N];
			CheTBDN = new boolean[N];
			Cot = new boolean[N];
			Toado = new Integer[N][2];
		}
		
	}
	
	private void Try(int i){
		
		if(i==N){ //Neu la cot thu N thi dung
			for(int k = 0; k<N;k++)
				System.out.print("(" + Toado[k][0]+", "+Toado[k][1]);
			System.out.println("");
		}else{
			
			for(int j = 0; j<N;j++){

				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	
	
}
