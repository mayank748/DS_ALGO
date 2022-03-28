import java.util.*;
public class subsetSumTwo{
	public static void findSubsets(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ansList){
		ansList.add(new ArrayList<>(ds));
		for(int i=ind;i<nums.length;i++){
			if(i!=ind && nums[i]==nums[i-1]) continue;
			ds.add(nums[i]);
			findSubsets(i+1,nums,ds,ansList);
			ds.remove(ds.size()-1);
		}
	}
	public static List<List<Integer>> subsetsWithOup(int [] nums){
		Arrays.sort(nums);
		List<List<Integer>> ansList=new ArrayList<>();
		findSubsets(0,nums,new ArrayList<>(),ansList);
		return ansList;
	}
	public static void main(String args[]){
		int ar[]=new int[]{1,2,2,2,3,4,6};
		System.out.println(subsetsWithOup(ar));
	}
}
