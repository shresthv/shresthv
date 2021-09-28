package set1;

public class SmallestValueInArray {
	
	static int Smallest() {
		int [] arr= {11,3,2,5,7};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Smallest value in array: "+Smallest());
	}

}

//11<0
//3<11 //condition satisfied min=3
//2<3//condition satisfied min=2
//5<2//condition not satisfied min=2