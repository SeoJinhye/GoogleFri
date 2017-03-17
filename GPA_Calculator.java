package lol;

import java.util.Scanner;

public class GPA_Calculator {
	
	public static Double[] GPA(Double[] a){
		
		Double A = 4.0;
		Double Am = 3.7;
		Double Bp = 3.3;
		Double B = 3.0;
		Double Bm = 2.7;
		Double Cp = 2.3;
		Double C = 2.0;
		Double Cm = 1.7;
		
		
		for(int i =0; i < a.length; i ++)
		{
			if(a[i] <120 && a[i]>= 93) a[i] = A;
			if(a[i]< 93 && a[i]>= 90) a[i] = Am;
			if(a[i]< 90 && a[i]>= 86) a[i] = Bp;
			if(a[i]< 86 && a[i]>= 83) a[i] = B;
			if(a[i]< 83 && a[i]>= 80) a[i] = Bm;
			if(a[i]< 80 && a[i]>= 76) a[i] = Cp;
			if(a[i]< 76 && a[i]>= 73) a[i] = C;
			if(a[i]< 77 && a[i]>= 70) a[i] = Cm;
			
		}
		
		
		return(a);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many subject do you have?");
		int count = sc.nextInt();
		Double[] a = new Double[count];
		
		for(int y = 0; y < count; y++)
		{
			int i = y +1;
			System.out.println("What is your "+ i + " grade?");
			a[y] = (double) sc.nextInt();
			
		}
		
		GPA(a);

		double add = 0;
		
		for(int i = 0; i < a.length; i ++)
			add += a[i];
			
		
		double avg = add/count;
		
		avg = Math.round(avg*10d) / 10d;
		
		System.out.println("GPA :" + avg);
		
		System.out.println("Do you want to know the avarage collage GPA for Majors? Type y to doso, type n to end the program");

		char yorn = sc.next().trim().charAt(0);
		
		if(yorn == 'y')
		{
			
			System.out.println("Education	3.36");
			System.out.println("Foreign Language3.34");
			System.out.println("English		3.33");
			System.out.println("Music		3.30");
			System.out.println("Religion	3.22");
			System.out.println("Biology		3.02");
			System.out.println("Psychology	2.98");
			System.out.println("Economics	2.95");
			System.out.println("Engineering	2.90");
			System.out.println("Math		2.90");
			System.out.println("Chemistry	2.78");
			
		char[] arr = new char[10];
		
		}
		
		System.out.println("What class are you intrested?");
	
		
		
		
	}

}
