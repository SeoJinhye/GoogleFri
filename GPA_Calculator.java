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
	
	 String TheClass = " ";
	 Double AvgGPA = 0.0;
	public GPA (String TheClass, Double AvgGPA){
		
		this.TheClass = TheClass;
		this.AvgGPA = AvgGPA;
		
		
		
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
		
		GPACalc(a);

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
			GPA[] P = new GPA[11]; 
		      P[0] = new GPA("Education", 3.36); 
		      P[1] = new GPA("Forign Language", 3.34); 
		      P[2] = new GPA("English", 3.33); 
		      P[3] = new GPA("Music", 3.3); 
		      P[4] = new GPA("Religion", 3.22); 
		      P[5] = new GPA("Biology", 3.02); 
		      P[6] = new GPA("Psychology", 2.98); 
		      P[7] = new GPA("Economic", 2.95); 
		      P[8] = new GPA("Engineering", 2.9); 
		      P[9] = new GPA("Math", 2.9); 
		      P[10] = new GPA("Chemistry", 2.78); 
		      GPA temp = null;
			 
		      for(int i = 0; i < P.length; i++) System.out.print(P[i].TheClass + " " + P[i].AvgGPA + "\n");
		      
		     System.out.println("What class are you intrested?");
		     Scanner scanner = new Scanner(System.in);
			 String klassQ = scanner.nextLine();
		
			 for(int i = 0; i < P.length; i++){
				 if(P[i].TheClass.equals(klassQ)){
					 int sub = 0;
					 Double percentage = 0.0;
					sub = i;
					 percentage = avg / P[sub].AvgGPA;
					 percentage *= 100;
					// percentage = Math.round(avg*10d) / 10d;
					 System.out.println("You have " + percentage + "% grade than your intrested class");
					break;
					
				 }
			 }

		}
		
		System.out.println("End of Program.");

	}

}
