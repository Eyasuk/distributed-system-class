importjava.rmi.*;
importjava.io.*;
public class ClientDate
{
public static void main(String args[]) throws Exception
{
String s1;
InterDateh1 = (InterDate)Naming.lookup("DS");
s1 = h1.display();
System.out.println(s1);
}
}
