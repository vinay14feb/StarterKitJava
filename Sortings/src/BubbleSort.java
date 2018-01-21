import java.util.Scanner;

public class BubbleSort {
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
		int length=elementsList.length;
		int temp=0;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-i-1;j++){
				if(elementsList[j]>elementsList[j+1]){
					temp=elementsList[j+1];
					elementsList[j+1]=elementsList[j];
					elementsList[j]=temp;
				}
			}
		}
		return elementsList;
	}
}
