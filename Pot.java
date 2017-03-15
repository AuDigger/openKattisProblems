package cProgramming;

import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,ones,total = 0;
		int numNums = sc.nextInt();
		for(int i=0;i<numNums;i++){
			num = sc.nextInt();
//			System.out.println("");
//			System.out.println("Num when reading in : " + num);
			ones = num % 10;
//			System.out.println("Num % 10 : " + ones);
			num = num/10;
//			System.out.println("Num / 10 : " + num);
//			System.out.println("Num^ones : " + Math.pow(num, ones));
			total+=Math.pow(num, ones);
//			System.out.println("Total : " + total);
			
		}
		System.out.println(total);
	}

}
