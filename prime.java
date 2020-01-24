import java.util.Scanner; 
class prime
{
public static void main(String[] args) {
int i,j,isprime=0,sum=0;
System.out.println("Prime Number for given range is: ");
for(i=2;i<=100;i++)
{
	isprime=0;
  for(j=2;j<=i/2;j++)
  {
     if(i%j==0)
     {
     	isprime=1;
     	break;
     	 }

  }

  if(isprime==0)
  {
     System.out.println(" "+i);
     sum+=i;
  }
}
System.out.println("Sum of the numbers are "+sum);
}
}
