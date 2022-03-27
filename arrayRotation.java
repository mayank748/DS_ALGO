import java.lang.*;
class arrayRotation {
public static void main(String args[]){
                int[] ar=new int[]{1,2,3,4,5,6};
                int numToMove=2;
                for(int i=0;i<6;i++){
                        System.out.print(ar[i]);
                }
                while(numToMove>0){
                        int temp=ar[0];
                        rotateLeft(ar,temp);
                        numToMove--;
                }
  				System.out.println("************");
                for(int i=0;i<6;i++){
                        System.out.print(ar[i]);
                }

        }
        public static void rotateLeft(int ar[],int temp){
                for(int i=0;i<5;i++){
                        ar[i]=ar[i+1];
                }
                ar[6-1]=temp;
        }
}
