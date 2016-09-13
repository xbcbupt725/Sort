
public class InsertionSort {
	
	public static void main(String[] args){
		int a[] = {2,1,5,6,3,8,4,7,9};
		insertion_sort2(a);
		for(int i : a){
			System.out.println(i);
		}	
		
	}
	
	public static void insertion_sort( int[] arr ) {
	    for( int i=0; i<arr.length-1; i++ ) {	
	        for( int j=i+1; j>0; j-- ) {
	            if( arr[j-1] <= arr[j] )
	                break;
	            int temp = arr[j];
	            arr[j] = arr[j-1];
	            arr[j-1] = temp;
	        }
	    }
	}
	// 将arr[i] 插入到arr[0]...arr[i - 1]中
		public static void insertion_sort1(int[] arr)
		{
			for (int i = 1; i < arr.length; i++ ) {
				int temp = arr[i];
				for (int j = i - 1; j >= 0 && arr[j] > temp; j-- ) {
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		public static void insertion_sort2(int[] arr){
			if(arr == null || arr.length <2) return ;
			for(int i = 1; i < arr.length; ++i){
				int key = arr[i];
				int j = i-1;
				for( ;j >= 0 && arr[j] > key;--j){
					arr[j+1] = arr[j];
				}
				arr[j+1] = key;
			}
		}
}
