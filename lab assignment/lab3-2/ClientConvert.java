importjava.rmi.*;
importjava.io.*;
public class ClientConvert
{
public static void main(String args[]) throws Exception
{
InterConverth1 = (InterConvert)Naming.lookup("Wrd");
BufferedReaderbr = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number : \t");
String no = br.readLine();
String ans = h1.convertDigit(no);
System.out.println("The word representation of the entered digit is : " +ans);
}
}
