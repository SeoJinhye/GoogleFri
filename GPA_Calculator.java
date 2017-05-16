package lol;

import java.util.Scanner;


public class GPA {
	
	

	public static Double[] GPACalc(Double[] a){
		
		
		Double A = 4.0;
		Double Am = 3.7;
		Double Bp = 3.3;
		Double B = 3.0;
		Double Bm = 2.7;
		Double Cp = 2.3;
		Double C = 2.0;
		Double Cm = 1.7;
		Double Dp = 1.3;
		Double D = 1.0;
		Double Dm = 0.7;
		Double F = 0.3;
		
		
		for(int i =0; i < a.length; i ++)
		{
			System.out.println(a[i]);
			if(a[i] <120.0 && a[i]>= 93.0) a[i] = A;
			else if(a[i]< 93 && a[i]>= 90) a[i] = Am;
			else if(a[i]< 90 && a[i]>= 86) a[i] = Bp;
			else if(a[i]< 86 && a[i]>= 83) a[i] = B;
			else if(a[i]< 83 && a[i]>= 80) a[i] = Bm;
			else if(a[i]< 80 && a[i]>= 76) a[i] = Cp;
			else if(a[i]< 76 && a[i]>= 73) a[i] = C;
			else if(a[i]< 77 && a[i]>= 70) a[i] = Cm;
			else if(a[i]< 70 && a[i]>= 66) a[i] = Dp;
			else if(a[i]< 66 && a[i]>= 63) a[i] = D;
			else if(a[i]< 63 && a[i]>= 60) a[i] = Dm;
			else if(a[i] < 60 && a[i] >= 0) a[i] = F;
			
		}
		
		
		return(a);
		
	}
	
	 String TheClass = " ";
	 Double AvgGPA = 0.0;
	public GPA (String TheClass, Double AvgGPA){
		
		this.TheClass = TheClass;
		this.AvgGPA = AvgGPA;
		
		
		
	}

	public static void main(String[] args) {
		int x  = 0;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("How many subject do you have?");
		int count = sc.nextInt();
		Double[] a = new Double[count];
		
		for(int y = x; y < count; y++)
		{
			int i = y +1;
			System.out.println("What is your "+ i + " grade?");
			a[y] = (double) sc.nextInt();
			
		}
		
		GPACalc(a);

		double add = 0;
		
		for(int i = 0; i < a.length; i ++)
			add += a[i];
			
		
		double avg = add/count;
		
		avg = Math.round(avg*10d) / 10d;
		
		System.out.println("GPA :" + avg);
		
		System.out.println("Do you want to know the GPA required for collage? Type y to doso, type n to end the program");

		char yorn = sc.next().trim().charAt(0);
		
		
		
		
		if(yorn == 'y')
		{
			GPA[] P = new GPA[11]; 
		      P[0] = new GPA("Bucknell University",  3.49); 
		      P[1] = new GPA("Carnegie Mellon University", 3.64); 
		      P[2] = new GPA("Colgate University", 3.72); 
		      P[3] = new GPA("Johns Hopkins University", 3.68); 
		      P[4] = new GPA("New York University", 3.6); 
		      P[5] = new GPA("Reed College", 3.8); 
		      P[6] = new GPA("Pennsylvania University ", 3.86); 
		      P[7] = new GPA("Southern California University", 3.8); 
		      P[8] = new GPA("Vanderbilt University", 3.7); 

		      GPA temp = null;
		      
		      
//			 for(int i = 0; i < 9; i++) P[i].TheClass.toLowerCase();
			 for(int i = 0; i < 9; i++) System.out.println(P[i].TheClass);
		      for(int i = 0; i < 9; i++) System.out.print(P[i].TheClass + " " + P[i].AvgGPA + "\n");
		      
		     System.out.println("What school are you intrested?");
		     
		     Scanner scanner = new Scanner(System.in);
			 String klassQ = scanner.nextLine();

			 
				String[] R = new String[P.length];
				for(int i = 0; i < P.length; i++){
					int j = P[i].TheClass.indexOf(" ");
					if(j != -1)
						R[i] = P[i].TheClass.substring(j);
				}
			 
			 for(int i = 0; i < P.length; i++){
				 if(R[i].equals(klassQ)){
					 int sub = 0;
					 Double percentage = 0.0;
					sub = i;
					 percentage = avg / P[sub].AvgGPA;
					 percentage *= 100;
					percentage = Math.round(percentage*100d) / 100d;
					 if(percentage > 100) System.out.println("You have " + percentage + "% higher grade than your intrested collage. Keep up the Good work!");
					 else System.out.println("You have " + percentage + "% grade than your intrested collage Work harder!");
					break;
					
				 }
			 }

		}
		
		System.out.println("End of Program.");

	}

}
