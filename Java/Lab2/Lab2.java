import java.io.*;
class MyArray
{
	int arr[]=new int[100];		//array of 100 integers
	int n;					//size of the array
	int high=0,small=0;
	MyArray(int a)			//constructor
	{
		n=a;
		for(int i=0;i<n;i++)
		{
			arr[i]=0;
		}
	}

	public void readArray()	 throws IOException	//to read values to the array
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value " +(i+1)+ " = ");
			arr[i]=Integer.parseInt(br.readLine());
		}
	}

	public void displayArray()   //to display the array
	{
		System.out.println("The array elements are listed below:");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element " +(i+1)+ " = ");
			System.out.println(arr[i]);
		}
	}

	public int highestNumber()		//returns the highest number in the array
	{
		high=arr[0];
		for(int i=1;i<n;i++)
		{
			if(high<arr[i])
			{
				high=arr[i];
			}
		}
		return (high);
	}

	public int smallestNumber()		//returns the smallest number in the array
	{
		small=arr[0];
		for(int i=1;i<n;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		return (small);
	}

	public int isRepeat(int a)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a)
			{
				count++;
			}
		}
		if(count>1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public int repeatedElementCount(int a)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public void showRepeatedNumbers()
	{
		System.out.println("heyyy");
		int c=0;
		for(int i=0;i<n;i++)
		{
			c=1;
			for(int j=(i+1);j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c>1)
			{
				System.out.println("Element "+(i+1)+ " is " +(arr[i])+ " which is repeated = " +c+ " times");
			}
			
		}
	}
	
}

public class Lab2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int size,ch,k=1;
		System.out.print("Enter the size of the array= ");
		size=Integer.parseInt(br.readLine());
		MyArray obj=new MyArray(size);
		while(k==1)
		{
			System.out.println("\n*******************************************MENU*******************************************");
			System.out.print("\nEnter the Choice: \n\t1. To read the array \n\t2. To display the array \n\t3. To find the highest element \n\t4. To display the smallest element \n\t5. To check if the number is repeated or not \n\t6. To see the count of the element \n\t7. Show repeated elements in array with their count \n\t8.Exit \n\tYour choice is = ");
			ch=Integer.parseInt(br.readLine());
		

			switch(ch)
			{
				case 1:
					obj.readArray();
					break;

				case 2:
					obj.displayArray();
					break;

				case 3:
					int h=obj.highestNumber();
					System.out.print("The highest number is= "+h);
					break;
				
				case 4:
					int s=obj.smallestNumber();
					System.out.print("\nThe smallest number in the array is = "+s);
					break;

				case 5:
					int rep;
					System.out.println("Enter the number you want to check");
					rep=Integer.parseInt(br.readLine());
					int res=obj.isRepeat(rep);
					if(res==1)
					{
						System.out.println("Yes, the number is repeated in the array");
					}
					else
					{
						System.out.println("No, the number is not repeated in the array");
					}
					break;

				case 6:
					int repeated;
					System.out.println("Enter the number you want to check");
					repeated=Integer.parseInt(br.readLine());
					int result=obj.repeatedElementCount(repeated);
					System.out.println("The number is repeated "+result+ " times");
					break;

				case 7:
					obj.showRepeatedNumbers();
					break;
				
				case 8:
					System.out.println("Thank You!");
					k=0;
					break;

				default:
					System.out.println("Invalid Entry");
			}//switch

		}//while
		

		/*obj.readArray();
		obj.displayArray();
		int h=obj.highestNumber();
		System.out.println("The highest number= "+h);*/
		
	}//main
}//class