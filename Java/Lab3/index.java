import java.io.*;


class Sports
{
	public String teamName;
	public byte players;
	public String league;
	public String coach;

	Sports()
	{
		teamName="";
		players=-1;
		league="";
		coach="";
	}
	Sports(String teamName)
	{
		this.teamName=teamName;
	}
	Sports(String teamName, byte players)
	{
		this(teamName);
		this.players=players;
	}
	Sports(String teamName, byte players,String league)
	{
		this(teamName,players);
		this.league=league;
	}
	Sports(String teamName, byte players,String league,String coach)
	{
		this(teamName,players,league);
		this.coach=coach;
	}
	
	void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name of the Team");
		teamName=br.readLine();
		System.out.println("Enter the number of Players in the team");
		players=Byte.parseByte(br.readLine());
		System.out.println("Enter which league you are in?");
		league=br.readLine();
		System.out.println("Enter the Name of the Coach of the Team");
		coach=br.readLine();
		}
		
		void display()
		{
			System.out.println("Name of the Team: "+teamName);
			System.out.println("Number of players: "+players);
			System.out.println("League: "+league);
			System.out.println("Name of Coach: "+coach);
		}
}

public class index
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=1;
		int i=1;
		football ftbl=new football();
		while(i==1)
		{	
			System.out.println("1.read");
			System.out.println("2.display");
			System.out.println("3.exit");	
			
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
						ftbl.read();
						break;
				case 2:
						ftbl.display();
						break;
				case 3:
						i=0;
						System.out.println("bye!!!");
			}	
		}
	}
}

class football extends Sports
{
	String country,state;
	float clubIncome;
	
	public football()
	{
		super();
		country="";
		state="";
		clubIncome=(float)0.0;
	}
	public football(String teamName, byte players,String league,String coach,String country, String state,float clubIncome)
	{
		super(teamName,players,league,coach);
		this.country= country;
		this.state=state;
		this.clubIncome=clubIncome;
	}

	public void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		super.read();
		System.out.println("Enter the origin Country");
		country=br.readLine();
		System.out.println("origin Region");
		state=br.readLine();
		System.out.println("enter clubs Income");	
		clubIncome=Float.parseFloat(br.readLine());
	}	
	
	public void display()
	{
		super.display();
		System.out.println("Country of the Club: "+country);
		System.out.println("Region of the club: "+state);
		System.out.println("Clubs Income: "+clubIncome);
	}
}