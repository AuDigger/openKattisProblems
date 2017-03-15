package cProgramming;

import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int numNums = sc.nextInt();
		int newNum;
		for(int i=0;i<numNums;i++){
		newNum = sc.nextInt();
		if(Math.abs(newNum)%2==1)System.out.println(newNum + " is odd");
		else System.out.println(newNum + " is even");
		}

	}

}
