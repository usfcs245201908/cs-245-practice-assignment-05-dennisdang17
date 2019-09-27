import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        if (a.length>1)
        {
            int left[] = Arrays.copyOfRange(a, 0, a.length/2);
            int right[] = Arrays.copyOfRange(a, (a.length/2), a.length);
            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }

    private void merge(int a[], int left[], int right[])
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
            {
                a[k++] = left[i++];
            }
            else
            {
                a[k++] = right[j++];
            }
        }
        
        while (i < left.length)
        {
            a[k++] = left[i++];
        }
            
        while (j < right.length)
        {
            a[k++] = right[j++];
        }
    }
}