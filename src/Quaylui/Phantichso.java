package Quaylui;

import FileIO.GetFileInput;

public class Phantichso {
/*
 * Cho so nguyen duong N<=30, hay tim cach phan tich so N thanh tong cua cac so nguyen duong
 * cach hoan vi chi la 1 cach
 * */
	Integer[] listnum = null;
	Integer[] listnumSum = null;
	boolean[] listnumcheck = null;
	static int N=0;
	int sum=0;
	public Phantichso(String path){
		listnum = GetFileInput.ReadNumberfromFile(path);
		for(int i:listnum) System.out.println(i+"");
		if(listnum!=null){
			N = listnum[0];
			listnumSum = new Integer[N];
			listnumcheck = new boolean[N];
			for(int i=0; i<N;i++) {
				listnumcheck[i] = false;
				listnumSum[i] = 0;
			}
		}
		
	}
	
	private void Try(int i) {
		if(sum==N) {
			for(int i1=0; (i1<(listnumSum.length));i1++){
				//if(listnumSum[i1]==0) continue;
				System.out.print(listnumSum[i1]+" ");
			}
			System.out.println("");
			for(int ik=0; ik<listnumSum.length;ik++) {
				listnumSum[ik] = 0;
			}
			sum = 0;
			return;
		}
		else{
			if(sum>N||i>=N){
				sum=0;
				for(int ik=0; ik<listnumSum.length;ik++) {
					listnumSum[ik] = 0;
				}
				return;
			}
			//if(i==0) return;
			for(int i2=1; i2<=N;i2++){		
				if(listnumcheck[i2-1]==false){
					sum +=i2;
					listnumSum[i] = i2;
					listnumcheck[i2-1] = true;
					Try(i+1);
					listnumcheck[i2-1] = false;
				}
				
			}
				
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phantichso phantichso = new Phantichso("C:/Users/BINH/Workspace_standard/Algorithm/src/Generation/input.txt");
		phantichso.Try(1);
	}

}
