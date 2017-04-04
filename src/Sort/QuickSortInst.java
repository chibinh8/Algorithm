package Sort;

public class QuickSortInst extends QuickSort<Integer>{
	
	public boolean compare(Integer a, Integer b){
		if(a.intValue()<b.intValue())
			return false;
		else if(a.intValue()>b.intValue())
			return true;
		return false;
	}


}
