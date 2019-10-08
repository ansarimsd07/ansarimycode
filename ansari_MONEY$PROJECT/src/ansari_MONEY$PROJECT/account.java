package ansari_MONEY$PROJECT;
import java.util.Scanner;
public class account 
{
 int bal;
 int previoustranscation;
 String accountname;
 String accountid;
 
 account(String aname,String aid)
 {
	 accountname=aname;
	 accountid=aid;
 }
void addmoney(int amt)
{
if(amt!=0)
{
	bal=bal+amt;
	previoustranscation=amt;
}
}
void paymoney(int amt)
{
	if(amt !=0)
	{
		bal=bal-amt;
		previoustranscation=-amt;		
	} 
}
void getprevioustranscation()
{
	if(previoustranscation >0)
	{
		System.out.println("add"+previoustranscation);
	}
	else if(previoustranscation <0)
	{
		System.out.println("send"+	Math.abs(previoustranscation));
	}
	else
	{
		System.out.println("no previous send occured");
	}
}

void profile()
{
	char c1='\0';
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("Welcome  "  + accountname);
	System.out.println("Your ID is "+accountid);
	System.out.println("**********************");
	System.out.println("**********************");
	
	System.out.println("1.CHECK BALANCE");
	System.out.println("2.ADD MONEY");
	System.out.println("3.PAY MONEY");
	System.out.println("4.PREVIOUS TRANSCATION");
	System.out.println("5.EXIT APPLICATION");
	
	do
	{
		System.out.println("*******************");
		System.out.println("ENTER WHAT YOU PROCEED:");
		System.out.println("*******************");
		c1=s1.next().charAt(0);

		switch(c1)
		{
	   case'1':
		    System.out.println("*************");
		    System.out.println("bal="+bal);
		    break;
	   case'2':
		     System.out.println("****************");
		     System.out.println("Enter How Much Amount You Add:");
		     System.out.println("*****************");
		     int amt = s1.nextInt();
		     addmoney(amt);
		     break;		     
	   case'3':
		     System.out.println("***************");
		     System.out.println("Enter How Much Money You to PAY:");
		     System.out.println("***************");
		     int amt1=s1.nextInt();
		     paymoney(amt1);
		     break;     
	   case'4':
		     System.out.println("************");
		     getprevioustranscation();
		     System.out.println("************");
		     break;
		     
	   case'5':
		     break;
		     
	   default:
		    System.out.println("invalid!! pls enter again");
		    break;
		}
	}	while(c1 !='5');
		System.out.println("*************");
		System.out.println("THANK YOU FOR USING APPLICATION");
		System.out.println("*************");
}
		public static void main(String[] args)
		{
			account ac=new account("ANSARI","8124007");
			ac.profile();	
	}
			
		}
		


