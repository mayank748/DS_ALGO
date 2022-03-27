import java.util.*;
public class recusrionOnSubsequence{

	public static void printSubSquence(int ind,LinkedList<Integer> li,int arr[],int n){
		if(ind==n){
			for(int value:li){
				System.out.print(value+" ");
			}
			if(li.size()==0){
				System.out.print("{}");
			}
			System.out.println();
			return;
		}

		printSubSquence(ind+1,li,arr,n);
		//take or pick the perticular index into the subsequence
		li.add(arr[ind]);
		printSubSquence(ind+1,li,arr,n);
		li.removeLast();

}
	public static void main(String args[]){
		int ar[]=new int[]{3,1,2};
		int n=3;
		int ind=0;
		LinkedList<Integer> li=new LinkedList<Integer>();
		printSubSquence(ind,li,ar,n);
	}
}
