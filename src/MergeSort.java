public class MergeSort{
	public static void main(String[] args){
		int a[] = {2,1,5,6,3,8,4,7,9};
		MergeSort(a);
		for(int i : a){
			System.out.println(i);
		}	
		
	}
	//将有二个有序数列a[first...mid]和a[mid...last]合并。
	private static void mergearray(int a[], int first, int mid, int last, int temp[])
	{
		int i = first, j = mid + 1;
		int m = mid,   n = last;
		int k = 0;
		
		while (i <= m && j <= n)
		{
			if (a[i] <= a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		
		while (i <= m)
			temp[k++] = a[i++];
		
		while (j <= n)
			temp[k++] = a[j++];
		
		for (i = 0; i < k; i++)
			a[first + i] = temp[i];
	}
	private  static void mergesort(int a[], int first, int last, int temp[])
	{
		if (first < last)
		{
			int mid = (first + last) / 2;
			mergesort(a, first, mid, temp);    //左边有序
			mergesort(a, mid + 1, last, temp); //右边有序
			mergearray(a, first, mid, last, temp); //再将二个有序数列合并
		}
	}

	public static boolean MergeSort(int a[])
	{   
		int n = a.length;
		int[] p = new int[n];
		mergesort(a, 0, n - 1, p);
		return true;
	}
}