importjava.rmi.*;
importjava.rmi.server.*;
importjava.util.*;
public class ServerDate extends UnicastRemoteObject implements InterDate
{
publicServerDate() throws Exception
{
}
public String display() throws Exception
{
String str = "";
Date d = new Date();
str = d.toString();
returnstr;
}
public static void main(String args[]) throws Exception
{
ServerDates1 = new ServerDate();
Naming.bind("DS",s1);
System.out.println("Object registered.....");
}
}
