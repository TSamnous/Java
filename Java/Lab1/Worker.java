import java.io.*;

class Worker
{
	String WorkerName;
	byte HoursWorked;
	float WagePerHour;
	
	public void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Name: ");
		WorkerName=br.readLine();

		System.out.println("Enter number of hours worked: ");
		HoursWorked=Byte.parseByte(br.readLine());

		System.out.println("what is the Wage per Hour: ");
		WagePerHour=Float.parseFloat(br.readLine());
	}

	public void display()
	{
	System.out.println("Name of the Worker: " + WorkerName);

	System.out.println("Number of hours worked by you: " + HoursWorked);

	System.out.println("Your Wage per Hour: " + WagePerHour);

	System.out.println("Your Total Wage: " + TotalWage());
	}

	public float calcwag()
	{
	return HoursWorked * WagePerHour;	
	}

	public float extraWage()
	{
		if(calcwag()<200)
		{
		return 150;
		}
		return 50;
	}

	public float TotalWage()
	{
		float daywage= calcwag();
		float extra = extraWage();
		return daywage+extra;
	}
public static void main(String [] args) throws IOException
{
	Worker wk = new Worker();
	wk.read();
	wk.calcwag();
	wk.extraWage();
	wk.TotalWage();
	wk.display();

}
}


