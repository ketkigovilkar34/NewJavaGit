
public class Date 
{
	int dd,mm,yy;
	Date swappusingArray()
	{
		dd=1;
		mm=1;
		yy=1;
	}
	public static void swap(Date [] mydate)
	{
		Date temp;
		temp=mydate[0];
		mydate[0]=mydate[1];
		mydate[1]=temp;
	}
	public String toString()
	{
		return "Date="+dd+"/"+mm+"/"+yy;
	}

	public static void main(String[] args) 
	{
		Date d1=new Date(4,6,2019);
		Date d2=new Dateate(5,7,2020);
		
	
		
	}

}
