public class checkPairWithGivenSum{
	public static void main(String args[]){
		int ar[]=new int[]{11, 15, 6, 8, 9, 10};
		int x=16;
		for(int i=0;i<ar.length;i++){
			for(int j=0;i<ar.length;i++){
				if(ar[j]!=ar[i]){
					if(ar[i]+ar[j]==x)
						System.out.println(true);
						return;
				}
			}
		}
	}
}
