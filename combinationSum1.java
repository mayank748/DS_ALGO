import java.util.*;
public class combinationSum1{

	public static void findCombinations(int ind,int []arr,int target, List<List<Integer>> ans,List<Integer> ds){
		if(ind ==arr.length){
			if(target==0){
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[ind]<=target){
			ds.add(arr[ind]);
			findCombinations(ind,arr,target-arr[ind],ans,ds);
			ds.remove(ds.size()-1);
		}
		findCombinations(ind+1,arr,target,ans,ds);

	}

	public static List<List<Integer>> combinationSum(int []can,int target){
		List<List<Integer>> ans=new ArrayList<>();
		findCombinations(0,can,target,ans,new ArrayList<>());
		return ans;
	}
	public static void main(String args[]){
		int ar[]=new int[]{1,2,3,4};
		int target=3;
		System.out.println(combinationSum(ar,target));
	}
}
