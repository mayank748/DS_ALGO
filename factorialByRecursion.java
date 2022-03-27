public class factorialByRecursion{
	public static int product(int n){
		if(n==0)
			return 1;
		return n*product(n-1);
	}
	public static void main(String args[]){
		System.out.println(product(5));
	}
}
