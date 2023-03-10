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
	Sports(String teamName, byte players,String league,String coachF,String coachL)
	{
        this.teamName=teamName;	
        this.players=players;
        this.league=league;
        this.coachF=coachF;
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
		    System.out.println("String Buffer");
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
}


public class index2
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
		Sports spt=new Sports();
		
		while(i==1)
		{	
			System.out.println("1.read");
			System.out.println("2.display");
			System.out.println("3.exit");	
			
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
						spt.read();
						break;
				case 2:
						System.out.println(" ");
						spt.display();

						break;
				case 3:
						i=0;
						System.out.println("bye!!!");
			}	
		}
	}
}