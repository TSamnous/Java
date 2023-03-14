import java.io.*;

import javax.print.DocFlavor.STRING;

abstract class Sports
{
    public void intro()
    {
        System.out.println("Implementation of abstract class");
    }

    public abstract void display();
}

class ios extends Sports
{
    String clubName,currLig,currPos;

    ios()
    {
        clubName="";
        currLig="";
        currPos="";
    }

    ios(String clubName, String currLig, String currPos)
    {
        this.clubName=clubName;
        this.currLig=currLig;
        this.currPos=currLig;
    }

    public void intro()
	{
		super.intro();
	}

    public void read()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Club Name: "+clubName);
		clubName=br.readLine();
		System.out.print("Enter Current League: "+currLig);
		currLig=br.readLine();
		System.out.print("Enter Current Position in the league: "+currPos);
		currPos=br.readLine();
	}

	public void display()
	{
		System.out.println("\n\n***********CLUB DETAILS***********");
		System.out.println("\tClub : "+clubName);
		System.out.println("\tLeague: "+currLig);
		System.out.println("\tPosition: "+currPos);	
	}
}

class index7
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int i=1,ch;
		final int teams=8;

		ios obj=new ios();

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
				System.out.println("\nLab Number= "+teams);
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