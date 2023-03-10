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
		teamName.toUpperCase();
		System.out.println("Enter the number of Players in the team");
		players=Byte.parseByte(br.readLine());
		System.out.println("Enter which league you are in?");
		league=br.readLine();
		league.toUpperCase();
		System.out.println("Enter the First Name of the Coach of the Team");
		coachF=br.readLine();
		coachF.toUpperCase();
		System.out.println("Enter the Last Name of the Coach of the Team");
		coachL=br.readLine();
		coachL.toUpperCase();
		
		System.out.println("Ticket price");
		ticket=Float.parseFloat(br.readLine());
		}
		
		void display()
		{
			System.out.println("Name of the Team: "+teamName.trim());
			System.out.println("Number of players: "+players);
			System.out.println("League: "+league);
			System.out.println("Name of Coach: "+coachF.concat(" ").concat(coachL));
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
		System.out.println("Local Region");
		state=br.readLine();
		System.out.println("Enter clubs Income");	
		clubIncome=Float.parseFloat(br.readLine());
	}	
	
	public void display()
	{
		super.display();
		System.out.println("Country of the Club: "+country.toUpperCase());
		System.out.println("Region of the club: "+state.toLowerCase());
		System.out.println("Clubs Income: "+clubIncome);
	}

	void display1()
	{
		StringBuffer sb=new StringBuffer(teamName);
		System.out.println("Methods of String Buffer Class");
		System.out.println("Append Method");
		System.out.println(sb.append(country));
		System.out.println("Insert method");
		System.out.println(sb.insert(1,"Java"));
		System.out.println("Replace Method");
		System.out.println(sb.replace(1,3,"aaa"));
		System.out.println("Delete Method");
		System.out.println(sb.delete(1,3));
	}

	
	static class fans
	{
		String fanF;
		String fanL;
		String fTeam;
		
		public void read() throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" ");
		System.out.println("***********FANS**********");
		System.out.println(" ");
		System.out.println("Enter your First Name");
		fanF=br.readLine();
		System.out.println("Enter your Last Name");
		fanL=br.readLine();
		System.out.println("Enter your Team");
		fTeam=br.readLine();
		}

		public void display()
		{
			System.out.println(" ");	
			System.out.println("***********FANS**********");
			System.out.println("Fan Name: " +fanF.concat(" ").concat(fanL));
			System.out.println("fan supporting Team: " +fTeam.toUpperCase());
		}
		
	}
	
}

public class index
{

	static
	{
		System.out.println(" ");
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
						System.out.println(" ");
						ftbl.display();
						fn.display();
						ftbl.display1();
						break;
				case 3:
						i=0;
						System.out.println("bye!!!");
			}	
		}
	}
}