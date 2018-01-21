import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Elements in the Array:");
		int n = sc.nextInt();
		int[] elementsList = new int[n];
		System.out.println("Enter the Elemnts :");
		for(int i=0;i<n;i++){
			elementsList[i]=sc.nextInt();
		}
		sc.close();
		elementsList=sort(elementsList);
		System.out.println("The Sorted ArrayList is ");
		for(int i:elementsList){
			System.out.print(i+" ");
		}		
	}

	private static int[] sort(int[] elementsList) {
		int n = elementsList.length;
		int temp=0;
		int count=0;
		for(int i=0;i<n;i++){
			temp=0;
			for(int j=i;j<n;j++){
			if(temp==0||temp>elementsList[j]){
				temp=elementsList[j];
				count=j;
			}
			}
			temp=elementsList[count];
			elementsList[count]=elementsList[i];
			elementsList[i]=temp;			
		}
		return elementsList;
	}
}
