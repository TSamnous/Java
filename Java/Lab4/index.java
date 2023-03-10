import java.io.*;


class Sports
{
	public String teamName;
	public byte players;
	public String league;
	public String coachF;
	public String coachL;
	static float ticket;

	Sports()
	{
		teamName="";
		league="";
		coachF="";
		coachL="";
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
	Sports(String teamName, byte players,String league,String coachF)
	{
		this(teamName,players,league);
		this.coachF=coachF;
		
	}
	Sports(String teamName, byte players,String league,String coachF,String coachL)
	{
		this(teamName,players,league,coachF);
		this.coachL=coachL;	
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
		System.out.println("Enter the first Name of the Coach of the Team");
		coachF=br.readLine();
		System.out.println("Enter the Last Name of the Coach of the Team");
		coachL=br.readLine();
		System.out.println("Ticket price");
		ticket=Float.parseFloat(br.readLine());
		}
		
		void display()
		{
			System.out.println("Name of the Team: "+teamName.toUpperCase());
			System.out.println("Number of players: "+players);
			System.out.println("League: "+league.toUpperCase());
			System.out.println("Name of Coach: "+coachF.concat(coachL));
			System.out.println("ticket price is: "+ticket);
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
	
	static class fans
	{
		String fan;
		String fTeam;
		
		public void read() throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***********FANS**********");
		System.out.println("enter your Name");
		fan=br.readLine();
		System.out.println("Enter your Team");
		fTeam=br.readLine();
		}

		public void display()
		{
			System.out.println("***********FANS**********");
			System.out.println("Fan Name: " +fan);
			System.out.println("fan supporting Team: " +fTeam);
		}
	}
	
}

public class index
{

	static
	{
		System.out.println("***************SPORTS MANAGEMENT***************");
		System.out.println("\n Welcome to the sports managements system");
		System.out.println("Please Enter your Club details");	
	}	

	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=1;
		int i=1;
		football ftbl=new football();
		football.fans fn=new football.fans();
		
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
						fn.read();
						break;
				case 2:
						ftbl.display();
						fn.display();
						break;
				case 3:
						i=0;
						System.out.println("bye!!!");
			}	
		}
	}
}