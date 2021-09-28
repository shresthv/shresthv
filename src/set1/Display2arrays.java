package set1;

import java.util.Iterator;

public class Display2arrays {
	public static void array1() {
		int[] a= {10,20,30,40};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"");
		}
	}
	public static void array2() {
		int[] b= {20,30,40,50};
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]+"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array 1 characters");
		array1();
		System.out.println("Array 2 characters");
		array2();
		//int c = a+b;
		//System.out.println("value of C is : "+c);
		
		
	}

}
