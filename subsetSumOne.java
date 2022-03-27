import java.util.*;
public class subsetSumOne{
	private static void func(int ind,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> sumSubset){
		if(ind==N){
			sumSubset.add(sum);
			return;
		}

		func(ind+1,sum+arr.get(ind),arr,N,sumSubset);

		func(ind+1,sum,arr,N,sumSubset);
	}
	public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr,int target){
		ArrayList<Integer> sumSubset=new ArrayList<>();
		func(0,0,arr,target,sumSubset);
		Collections.sort(sumSubset);
		return sumSubset;
	}
	public static void main(String args[]){
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		int target=3;
		System.out.println(subsetSums(arr,target));
	}
}
