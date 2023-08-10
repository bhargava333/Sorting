import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array before sorting...");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		Sort sort = new Sort();
		sort.selectionSort(arr);
		System.out.println("array after sorting...");
		for (int x : arr) {
			System.out.print(x+" ");
		}


	}

}
