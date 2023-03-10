import java.io.*;
class Customer
{
    String name;
    String address;
    void read() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader((isr));
        System.out.println("Please Enter your name");
        name=br.readLine();
        System.out.println("Please Enter your address");
        address=br.readLine();
    }
    void display()
    {
        System.out.println("My Name is "+name);
        System.out.println("The address is: "+address);
        System.out.println("The length of the name"+name.length());
        System.out.println("Demonstrating charAt function "+name.charAt(2));
        System.out.println("Demonstrating substring from index i to end "+name.substring(1));
        System.out.println("Demonstrating substring from index i to index j "+name.substring(2,6));
        System.out.println("Demonstrating concat function by concatenating name and address");
        System.out.println(name.concat(address));
        System.out.println("Demonstrating index of function which returns the index of the first occurence of the speified String "+name.indexOf("ag"));
        System.out.println("similarly we have a lastindexof function");
        System.out.println("Demonstrating Boolean Equals Functions "+name.equals(name));
        System.out.println("Demonstrating Boolean Equals Functions "+address.equals(name));
        System.out.println("Demonstrating compare to function which returns <0 if s1 comes before s2 >0 if s1 comes after s2 =0 if s1 and s2 are equal");
        System.out.println(name.compareTo("Abraham"));
        System.out.println(name.compareTo("Rajesh"));


    }
void display1()
{
    StringBuffer sb=new StringBuffer(name);
    System.out.println("Methods of String Buffer Class");
    System.out.println("Append Method");
    System.out.println(sb.append(address));
    System.out.println("Insert method");
    System.out.println(sb.insert(1,"Java"));
    System.out.println("Replace Method");
    System.out.println(sb.replace(1,3,"aaa"));
    System.out.println("Delete Method");
    System.out.println(sb.delete(1,3));

}

}
public class Lab5 {
    public static void main(String args[]) throws UnsupportedEncodingException
    {
        byte[] b_arr = {71, 101, 101, 107, 115};
        int [] i_arr={71,101,101,107,115};
        String s2=new String(i_arr,0,5);//Only passing the integer array was parameter will not work
        String s = new String(b_arr,"US-ASCII");//Uses US-ASCII as an encoding technique
        String s1=new String(b_arr,1,3);//Constructs a new String from the numbers at the start index to
        //the end index
        System.out.println("The new String is " + s2);

Customer obj=new Customer();
obj.read();
obj.display();
obj.display1();

    }
}



OutPut

"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=54058:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Sagnik\IdeaProjects\Lab5\out\production\Lab5 Lab5
The new String is Geeks
Please Enter your name
Sagnik
Please Enter your address
Garia Kolkata
Methods of String class
My Name is Sagnik
The address is: Garia Kolkata
The length of the name6
Demonstrating charAt function g
Demonstrating substring from index i to end agnik
Demonstrating substring from index i to index j gnik
Demonstrating concat function by concatenating name and address
SagnikGaria Kolkata
Demonstrating index of function which returns the index of the first occurence of the speified String 1
similarly we have a lastindexof function
Demonstrating Boolean Equals Functions true
Demonstrating Boolean Equals Functions false
Demonstrating compare to function which returns <0 if s1 comes before s2 >0 if s1 comes after s2 =0 if s1 and s2 are equal
18
1
Methods of String Buffer Class
Append Method
SagnikGaria Kolkata
Insert method
SJavaagnikGaria Kolkata
Replace Method
SaaavaagnikGaria Kolkata
Delete Method
SavaagnikGaria Kolkata

Process finished with exit code 0


