
public class Sort {
	void selectionSort(int arr[])
	{
		int max;
		int pos;
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			max= arr[i];
			pos = i;
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]>max)
				{
					max = arr[j];
					pos = j;
				}
			}
			//swap
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}

}
