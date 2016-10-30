package UnionFind;

import edu.princeton.cs.algs4.QuickFindUF;

public class Percolation {
	int[][] SideArray;
	QuickFindUF quickfindUf;
	int n;
	boolean isFull_bol =true;
	
	private boolean TwoSideIsConnect(int n1, int n2) {
		boolean retval = quickfindUf.connected(n1, n2);
		return retval;
	}
	
	private boolean IsTwoFullSideConnected(int row1, int col1, int row2, int col2) {
		boolean retVal = false;
		retVal =  (TwoSideIsConnect(row1*n+col1,row2*n+col2)&&isFull(row2, col2));
		return retVal;
	}
	
	private boolean AnyFullNeightborConnectedtoCurrentSide(int row, int col) {
		if(col!=0){
			if(IsTwoFullSideConnected(row, col,row-1, col)) return true;
			if(IsTwoFullSideConnected(row, col,row, col-1)) return true;
			if((IsTwoFullSideConnected(row, col, row, col+1))) return true;
		    
		    
		}

		else{
			
			if(IsTwoFullSideConnected(row, col,row-1, col)) return true;
			if(IsTwoFullSideConnected(row, col, row, col+1)) return true;
					
			
		}
		
		return false;
			
	}
	
	private int FirstOpenSide() {
		int index =-1;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(SideArray[i][j]==1){
					index =  n*i+j; 
					return index;
				}
			}
		}
		
		return index;
				
	}
	public Percolation(int n)                // create n-by-n grid, with all sites blocked
	{	quickfindUf = new QuickFindUF(n*n);
		this.n = n;
		isFull_bol = false;
		this.SideArray = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
			SideArray[i][j]=0; //close
			}
		}
		
	}
	public void open(int row, int col)       // open site (row, col) if it is not open already
	{
		this.SideArray[row][col] = 1;//open
		int ret = FirstOpenSide();
		if(ret!=-1)
			quickfindUf.union(n*row+col,ret);
		
	}
	public boolean isOpen(int row, int col)  // is site (row, col) open?
	{
		if(SideArray[row][col]==1)
			return true;
		else
			return false;
	}
	
	public boolean isFull(int row, int col)  // is site (row, col) full?
	{	System.out.println(" " + row + ", " + col);

		if(row==0&&SideArray[row][col]==1)//is first row and open
			return isFull_bol; //always set to true
		else if(SideArray[row][col]==1){
			//check neighbor is connected?
			return (isFull_bol&AnyFullNeightborConnectedtoCurrentSide(row,col));
			
		}else
			return false;
			
	}
	public boolean percolates()              // does the system percolate?
	{			
		for(int i =0; i<n;i++){
			isFull_bol = true;
			
			if(isFull(n-1, i)) return true;
			
		}
		return false;

	}
	
	public static void main(String[] args)   // test client (optional)
	{   Percolation percolation = new Percolation(5);
		percolation.open(0, 0);
		percolation.open(1, 0);
		percolation.open(1, 1);
		percolation.open(1, 2);
		percolation.open(2, 2);
		percolation.open(3, 2);
		percolation.open(4, 2);
		percolation.open(1, 3);
		percolation.open(0, 3);
	   	System.out.println("Is Full " + percolation.percolates());
		
	}
}
