import java.util.*;
public class printOnlyOneConditionNotUsingList{
	public static int onlyOneSumFunction(int ind,int s,int sum,int arr[],int n){
		if(ind==n){
			// condition satisfied
			if(s==sum) return 1;
			// condition not satisfied
			else return 0;
		}

		s+=arr[ind];

		int l=onlyOneSumFunction(ind+1,s,sum, arr ,n);
		s-=arr[ind];

		int r=onlyOneSumFunction(ind+1,s,sum,arr,n);
		return l+r;
	}
	public static void main(String args[]){
		int ar[]=new int[]{1,2,3};
		int n=3;
		int sum=2;
		System.out.println(onlyOneSumFunction(0,0,sum,ar,n));
	}
}

