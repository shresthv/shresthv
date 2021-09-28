package set1;

public class LargestValueInArray {

	public static int largest() {
		int [] arr= {1,55,202,566};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest values in array: "+largest());
	}

}
