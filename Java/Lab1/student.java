import java.io.*;

class student
{
	byte RollNo;
	String Name;
	String Course;
	byte Marks[] = new byte[5];

	public void read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter yout Roll Number: ");
		RollNo=Byte.parseByte(br.readline());

		System.out.println("Enter your Name: ");
		Name=br.readline());

		System.out.println("Enter your Course: ");
		Name=br.readline());
		
		System.out.println("Enter your marks: ");
		for(i=0;i<5;i++)
		{
			marks[i] = Byte.parseByte(br.readLine());
		}

	}
    private float calculate(){
        float avg;
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=marks[i];
        }
        avg = (float)sum/5;
        return avg;
    }
    private void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
        System.out.println("Marks: ");
        for(int i=0;i<5;i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Average: "+calculate());
    }

    public static void main(String [] args) throws IOException{
        Student stu = new Student();
        stu.read();
        stu.display();
    }
}

}