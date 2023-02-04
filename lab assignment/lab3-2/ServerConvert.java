importjava.rmi.*;
importjava.rmi.server.*;
public class ServerConvert extends UnicastRemoteObject implements InterConvert
{
publicServerConvert() throws Exception
{
}
public String convertDigit(String no) throws Exception
{
String str = "";
for(int i = 0; i <no.length(); i++)
{
int p = no.charAt(i);
if( p == 48)
{
str += "zero ";
}
if( p == 49)
{
str += "one ";
}
if( p == 50)
{ 
33
str += "two ";
}
if( p == 51)
{
str += "three ";
}
if( p == 52)
{
str += "four ";
}
if( p == 53)
{
str += "five ";
}
if( p == 54)
{
str += "six ";
}
if( p == 55)
{
str += "seven ";
}
if( p == 56)
{
str += "eight ";
}
if( p == 57)
{
str += "nine ";
}
}
returnstr;
}
public static void main(String args[]) throws Exception
{
ServerConverts1 = new ServerConvert();
Naming.bind("Wrd",s1);
System.out.println("Object registered....");
}
}
