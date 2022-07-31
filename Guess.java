import java.util.*;
import java.util.Random;
public class Guess
{
public static void main(String args[])
{
	Random r=new Random();
     int ra=r.nextInt(100);
	    int score=100,chance=5;
	    Scanner pqr=new Scanner(System.in);
int i=0;
	for( i=0;i<chance;i++)
	{
		System.out.println("Enter your number ");
		int n=pqr.nextInt();
     if(ra==n)
	{
        System.out.println("Yeah! Your number is Matched with Generated number ");
        System.out.print("Your guessing score is "+score+"%"); break;
     }
     else if(n<ra)
	{
        score=score-20;
        System.out.println("Your number is less than Generated Number!! TRY AGAIN");
     }
     else if(n>ra)
	{
        score=score-20;
        System.out.println("Your number is More than Generated Number!! TRY AGAIN");
     }
   }
if(i>=5)
	 System.out.println("Chances are over ");
}}