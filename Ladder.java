package cProgramming;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int opposite,angle;
		
		double hypot;
		
		
		opposite = sc.nextInt();
		angle = sc.nextInt();
		hypot = opposite/Math.sin(Math.toRadians(angle));
		System.out.println(Math.ceil(hypot));
		
		
		
	}

}
