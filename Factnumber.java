# Factnumber
import java.io.*;
import java.util.*;
public class Factnumber
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int j=1,output=0;
  System.out.println("Enter the number");
  int n=s.nextInt();
  for(i=1;i<=n;i++)
  { 
   j=j*i;
   output=j;
   }
   System.out.println(output);
   }
}
