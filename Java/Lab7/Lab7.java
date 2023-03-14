import java.io.*;

abstract class Movie
{
	public void intro()
	{
		System.out.println("Implementation of abstract class");
	}

	//public abstract void read();

	public abstract void display();									
}

class MIS extends Movie
{
	
	String nm="";
	String lead_male="";
	String lead_female="";

	MIS()
	{
		nm="";
		lead_male="";
		lead_female="";
	}

	public void intro()
	{
		super.intro();
	}

	public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter movie name: "+nm);
		nm=br.readLine();
		System.out.print("Lead male actor: "+lead_male);
		lead_male=br.readLine();
		System.out.print("Lead female actor: "+lead_female);
		lead_female=br.readLine();	
	}

	public void display()
	{
		System.out.println("\n\n***********MOVIE DETAILS***********");
		System.out.println("\tMovie name: "+nm);
		System.out.println("\tLead Male Actor: "+lead_male);
		System.out.println("\tLead Female Actor: "+lead_female);	
	}

}

class Lab7
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int i=1,ch;
		final int lab_num=7;

		MIS obj=new MIS();

		while(i==1)
		{
			System.out.println("\n\n");
			System.out.print("Enter \n\t1. For Intro \n\t2. Read \n\t3. Display \n\t4. Final keyword \n\t5. Exit \n\tYour choice-> ");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
				obj.intro();
				System.out.println("Included abstract method and super keyword");
				break;

				case 2:
				obj.read();
				System.out.println("\nInput taken successfully");
				break;
		
				case 3:
				obj.display();
				System.out.println("\nOutput displayed successfully");
				break;

				case 4:
				//lab_num++;
				System.out.println("\nLab Number= "+lab_num);
				System.out.println("\nImplemented final keyword successfully");
				break;
		
				case 5:
				i=0;
				System.out.println("\nThank You! Visit again!");
				break;

				default:
				System.out.println("\nInvalid entry!");

			}
		}
		
	}
	
}