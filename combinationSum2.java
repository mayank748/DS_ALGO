import java.util.*;
public class combinationSum2{
	private static void findCombination(int ind,int []arr,int target,List<List<Integer>> ans,List<Integer> ds){
		if(target==0){
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=ind;i<arr.length;i++){
			if(i>ind && arr[i]==arr[i-1]) continue;
			if(arr[i]>target) break;

			ds.add(arr[i]);
			findCombination(i+1,arr,target-arr[i],ans,ds);
			ds.remove(ds.size()-1);
		}
	}
	public static List<List<Integer>> combinationSumTwo(int can[],int target){
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(can);
		findCombination(0,can,target,ans,new ArrayList<>());
		return ans;
	}
	public static void main(String args[]){
		int can[]=new int[]{1,1,1,2,2};
		int target=4;
		System.out.println(combinationSumTwo(can,target));
	}
}
