package Sort;

public abstract class QuickSort<Item> {
	
	public abstract boolean compare(Item a, Item b);//false: less than, true: greater than or equal
	
	private void exchange (Item[] a, int i, int j) {
		
		Item temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public int parttion(Item[] a, int low, int hi) {
			int i = low;
			int j = hi+1;
			
			while(true){
				if(j==0) break;
				while (compare(a[low],a[++i])==true) 
					if(i==hi) break; 
				while (compare(a[low],a[--j])==false) 
					if(j==low) break;				
				if(i>=j) break;

				exchange(a, i, j);

			}
			
			exchange(a, low, j);

			return j;
	}
	
	public void sort(Item[] a, int low, int hi) {
		//remember i, i is index
		if (hi <= low) return;
		int j = parttion(a, low, hi);
		sort(a, low, j-1);
		sort(a, j+1, hi);
	}

}

