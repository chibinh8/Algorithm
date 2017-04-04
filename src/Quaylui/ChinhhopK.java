package Quaylui;

import FileIO.GetFileInput;

public class ChinhhopK {
	Integer[] listnum = null;
	Integer[] listChinhHop = null;
	static boolean[] listNumUsed  = null;
	Integer[] listNumBase  = null;
	static int N=0;
	int k=0;
	public ChinhhopK(String path){
		listnum = GetFileInput.ReadNumberfromFile(path);
		for(int i:listnum) System.out.println(i+"");
		if(listnum!=null){
			N = listnum[0];
			k = listnum[1];
			listChinhHop = new Integer[k];
			listNumUsed = new boolean[N];
			listNumBase = new Integer[N];
			for(int i = 0; i<N;i++) {
				listNumUsed[i] = false;
				listNumBase[i] = i+1;
			}
		}
		
	}
	
	private void Try(int ik) {
		

		if(ik==k) {
			
			System.out.println("\nChinh hop: ");
			for (int j=0; j<k;j++) System.out.print(listChinhHop[j]+" ");
			System.out.println("");				
			ik=0;
			return;
			  
		}
		for(int t=0; t<N;t++){
			if(listNumUsed[t]==false){

				listChinhHop[ik] = t+1;								
				listNumUsed[t] = true;	
				Try(ik+1);
				listNumUsed[t] = false;
			}	

			
	    } 	
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChinhhopK chinhhopK = new ChinhhopK("C:/Users/BINH/Workspace_standard/Algorithm/src/Generation/input.txt");
		chinhhopK.Try(0);

	}
}
