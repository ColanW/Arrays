package main;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		//Array
		
		Integer x[] = new Integer[3];
		
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		
		//for( int i =0; i < x.length; i++) {
		//	System.out.println(x[i]);
		//}
		
		//2D+ Array
		
	//	Integer k[][] = new Integer[3][3];
		
	//	for(int ii = 0; ii < k.length; ii++) {
			
	//		for(int iii = 0; iii < k.length; iii++) {
				
	//			k[ii][iii] = ii;
	//			
	//		}
			
	//	}
		
	//	for(int ii = 0; ii < k.length; ii++) {
			
	//		for(int iii = 0; iii < k.length; iii++) {
				
	//			System.out.println(k[ii][iii]);
				
	//		}
			
	//	}
		
		//ArrayList
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Hello ");
		s.add("World!");
		
		for(int o = 0; o < s.size(); o++) {
			
			System.out.print(s.get(o));
			
		}
		
	}
	
}
