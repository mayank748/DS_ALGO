import java.util.*;
public class printOnlyOneCondition{
	public static boolean onlyOneSumFunction(int ind,LinkedList<Integer> li,int s,int sum,int arr[],int n){
		if(ind==n){
			// condition satisfied
			if(s==sum){
				for(int value:li){
				 System.out.print(value+" ");
				}
				System.out.println();
				return true;
			}
			// condition not satisfied
			else return false;
		}
		
		li.add(arr[ind]);
		s+=arr[ind];

		if(onlyOneSumFunction(ind+1,li,s,sum, arr ,n)==true){
			return true;
		}
		s-=arr[ind];
		li.removeLast();

		if(onlyOneSumFunction(ind+1,li,s,sum,arr,n)==true)return true;
		return false;
	}
	public static void main(String args[]){
		int ar[]=new int[]{1,2,3};
		int n=3;
		int sum=2;
		LinkedList<Integer> li=new LinkedList<Integer>();
		//onlyOneSumFunction();
		System.out.println(onlyOneSumFunction(0,li,0,sum,ar,n));
	}
}
