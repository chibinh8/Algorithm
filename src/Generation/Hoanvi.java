package Generation;

import FileIO.GetFileInput;
import Sort.QuickSortInst;

public class Hoanvi {
	Integer[] listnum;
	QuickSortInst qsort = new QuickSortInst();
	public Hoanvi(String path){
		
		listnum = GetFileInput.ReadNumberfromFile(path);
			
		qsort.sort(listnum, 0, listnum.length-1);
		for(int i:listnum) System.out.println(i+"");
		
	}
	
	private void exchange(Integer[] a, int i, int j){

		a[i] =a[i]+ a[j];
		a[j]= a[i] - a[j];
		a[i] = a[i] - a[j]; 
	}
	
	public void SinhHoanvi(){
		/*Find the index of first element less than it's preceding element*/
		Integer[] listnumtemp = listnum;
		int ifirst=-1, numhv=0;
		if(listnumtemp==null) return;
		do{
		ifirst=-1;
		for(int i=listnumtemp.length-1;i>0;i--){
			if(listnumtemp[i-1]<listnumtemp[i]){
				ifirst = i-1;
				break;
			}
		}
		if(ifirst==-1) break;
		//find first value greater than ifirst element
		int isecond=listnumtemp.length-1;
		for(int i=listnumtemp.length-1;i>ifirst;i--){
			if(listnumtemp[i]>listnumtemp[ifirst]){
				isecond = i;
				break;
			}
		}
		
		exchange(listnumtemp,ifirst, isecond);
		qsort.sort(listnumtemp, ifirst+1, listnum.length-1);
		System.out.println("Hoan vi thu " + ++numhv);
		for(int k:listnumtemp) System.out.println(k+"");
		}
		while(ifirst>=0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hoanvi hoanvi = new Hoanvi("C:/Users/BINH/Workspace_standard/Algorithm/src/Generation/input.txt");
		hoanvi.SinhHoanvi();
	}

}
