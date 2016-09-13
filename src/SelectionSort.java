
public class SelectionSort {
	
	public static void main(String[] args){
		int a[] = {2,1,5,6,3,8,4,7,9};
		selection_sort(a);
		for(int i : a){
			System.out.println(i);
		}	
		
	}
	
	public static void selection_sort(int[] arr) {
		int i, j, min, temp, len = arr.length;
		for (i = 0; i < len - 1; i++) {
			min = i;
			for (j = i + 1; j < len; j++)
				if (arr[min] > arr[j])
					min = j;
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
