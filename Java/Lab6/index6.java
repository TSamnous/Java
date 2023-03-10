import java.io.*;
import pack1.coach;
import pack1.ticketCollection;

class Club
{
	String clubName,CurrLig,currPos;

	Club()
	{
		clubName="";
		CurrLig="";
		currPos="";
	}
	Club(String clubName,String CurrLig,String currPos)
	{
		this.clubName=clubName;
		this.CurrLig=CurrLig;
		this.currPos=currPos;
	}

	public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Club Name: "+clubName);
		clubName=br.readLine();
		System.out.print("Enter Current League: "+CurrLig);
		CurrLig=br.readLine();
		System.out.print("Enter Current Position in the league: "+currPos);
		currPos=br.readLine();
	}

	public void display()
	{
		System.out.println("\n\n***********CLUB DETAILS***********");
		System.out.println("\tClub : "+clubName);
		System.out.println("\tLeague: "+CurrLig);
		System.out.println("\tPosition: "+currPos);	
	}
}

class ios extends Club
{
	ios()
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

class FullInfo extends ios implements coach,ticketCollection
{
	String coach;
	String collection;
	
	FullInfo()
	{
		coach="";
		collection="";
	}

	public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		super.read();
		System.out.print("Enter coach Name: "+coach);
		coach=br.readLine();
		System.out.print("Earning: Rs "+collection);
		collection=br.readLine();
	}

	public void display()
	{
		super.display();
		System.out.println("\tcoach: "+coach);
		System.out.println("\tEarning: Rs "+collection);
	}

	public void coachDetails()
	{
		System.out.println("coach Name: "+coach);
	}

	public void earning()
	{
		System.out.println("Total earning: Rs "+collection);
	}
}

class index6
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		
		FullInfo obj=new FullInfo();
		int i=1,ch;
		while(i==1)
		{
			System.out.println("\n******************************************************************");
			System.out.print("Enter \n\t1. Read \n\t2. Display \n\t3. coach Details \n\t4. Tickets Earning \n\t5. Exit \n\tYour choice: ");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					String clubName=args[0];
					String CurrLig=args[1];
					String currPos=args[2];
					String coach=args[3];
					String collection=args[4];
					obj.clubName=clubName;
					obj.CurrLig=CurrLig;
					obj.currPos=currPos;
					obj.coach=coach;
					obj.collection=collection;
					System.out.println("Input taken from command line!");
					break;
			
				case 2:
					obj.display();
					break;

				case 3:
					obj.coachDetails();
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
