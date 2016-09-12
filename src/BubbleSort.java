public class BubbleSort
{   
	public static void main(String[] args){
		int a[] = {2,1,5,6,3,8,4,7,9};
		sort(a);
		for(int i : a){
			System.out.println(i);
		}	
		
	}
    public static void sort(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}