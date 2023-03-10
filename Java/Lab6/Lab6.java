import java.io.*;
import pack1.Director;
import pack1.BoxOfficeCollection;

class Movie
{
	String nm="";
	String lead_male="";
	String lead_female="";

	Movie()
	{
		nm="";
		lead_male="";
		lead_female="";
	}
	Movie(String nm,String lead_male,String lead_female)
	{
		this.nm=nm;
		this.lead_male=lead_male;
		this.lead_female=lead_female;
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

class MIS extends Movie
{
	MIS()
	{
		super();
	}

	public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nTaking Input");
		super.read();
	}
	
	public void display()
	{
		System.out.println("\nDisplaying output");
		super.display();
	}
}

class FullInfo extends MIS implements Director,BoxOfficeCollection
{
	String director;
	String earning1;
	
	FullInfo()
	{
		director="";
		earning1="";
	}

	public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		super.read();
		System.out.print("Enter director name: "+director);
		director=br.readLine();
		System.out.print("Earning: Rs "+earning1);
		earning1=br.readLine();
	}

	public void display()
	{
		super.display();
		System.out.println("\tDirector: "+director);
		System.out.println("\tEarning: Rs "+earning1);
	}

	public void director_details()
	{
		System.out.println("Director name: "+director);
	}

	public void earning()
	{
		System.out.println("Total earning: Rs "+earning1);
	}
}

class Lab6
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		
		FullInfo obj=new FullInfo();
		int i=1,ch;
		while(i==1)
		{
			System.out.println("\n******************************************************************");
			System.out.print("Enter \n\t1. Read \n\t2. Display \n\t3. Director Details \n\t4. Box Office Earning \n\t5. Exit \n\tYour choice: ");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					String nm=args[0];
					String lead_male=args[1];
					String lead_female=args[2];
					String director=args[3];
					obj.nm=nm;
					obj.lead_male=lead_male;
					obj.lead_female=lead_female;
					obj.director=director;
					String earning1=args[4];
					obj.earning1=earning1;
					//obj.read();
					System.out.println("Input taken from command line!");
					break;
			
				case 2:
					obj.display();
					break;

				case 3:
					obj.director_details();
					break;

				case 4:
					obj.earning();
					break;
			
				case 5:
					i=0;
					System.out.println("Thank You!");
					break;

				default:
					System.out.println("Invalid Entry!");

			}
		}
	}
}
