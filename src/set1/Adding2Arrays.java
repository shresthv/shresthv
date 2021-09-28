package set1;

import java.util.Arrays;

public class Adding2Arrays {
	
	static void arr() {
		int[] arr1= {11,55,47,66};
		int[]  arr2= {55,47,69,78};
		int fal=arr1.length;
		int sal=arr2.length;
		int[] result=new int[fal+sal];
		System.arraycopy(arr1, 0, result, 0, fal);  
		System.arraycopy(arr2, 0, result, fal, sal);  
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
	arr();
		
		// TODO Auto-generated method stub

	}

}
