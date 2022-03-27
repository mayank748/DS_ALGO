public class multipleRecursionCall{
	public static int multipleCall(int n){
	
		if(n<=1)
		return n;
		else
		return multipleCall(n-1)+ multipleCall(n-2);
	}
	public static void main(String args[]){
		System.out.println(multipleCall(7));
	}
}
