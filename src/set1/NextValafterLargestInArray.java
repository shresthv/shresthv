package set1;

public class NextValafterLargestInArray {
	
	static int arr() {
		int[] A= {11,20,1,56,589};
		//To check -ve values
		//int[] A= {-1,-2,-3};
		int val=A[0];
		int NxtVal = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i]>val) {
				val=A[i];
				val++;
				NxtVal=val;
			}
		}
		return NxtVal;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Next value is: "+ arr());
	}

}
