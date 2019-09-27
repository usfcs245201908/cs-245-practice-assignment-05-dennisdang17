public class QuickSort implements SortingAlgorithm
{

	public  void sort(int [] a)
	{
		quickSort(a, 0, a.length-1);
	}

    public  void quickSort(int[] a, int left, int right)
    {
        if (left >= right)
        {
			return;
		}
		int pivot = a[(left + right)/2];
		int index = partition(a, left, right, pivot);
		quickSort(a, left, index - 1);
		quickSort(a, index, right);	
	}

    private int partition(int[] a, int left, int right, int pivot)
    {
        while (left <= right)
        {
            while (a[left] < pivot)
            {
				left++;
			}
            while (a[right] > pivot)
            {
				right--;
			}
            if (left <= right)
            {
				swap(a,left, right);
				left++;
				right--;
			}
		}
		return left;
    }
    
    private void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}