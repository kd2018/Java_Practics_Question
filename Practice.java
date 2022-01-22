import java.util.Scanner;
class Practice
{
	/* 
	wap to the count netsalary for acourding to the basic salary provoided by  User
		har 5% Basic/
		da  7% Basic/
		if 10k <= 10%
		15k-20k <=20%
		20k pf <=18%
	*/
	public static void main(String args[])
	{	int netsalary ,hra,da ,fp;
		Scanner sc=new Scanner(System.in);
		// basic salary input
		System.out.println("\n Enter the Basic Salary");
		float basic=sc.nextFloat();
		if(basic<=10000)
		{
			 hra=float(basic*0.02);
			 da=basic*80;
			 netsalary=hra+da;
			 System.out.print("NetSalary"+netsalary);
		}
		else if(basic<=20000)
		{
			hra=basic*0.25;
			da=basic*90;
		    netsalary=hra+da;
			System.out.print("NetSalary"+netsalary);
		}
		else if(basic>20000)
		{
			hra=basic*0.333;
			da=basic*95;
		    netsalary=hra+da;
			System.out.print("NetSalary"+netsalary);
		}
		
	}
}