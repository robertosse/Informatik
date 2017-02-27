
import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	anagramInArray();
	anagramLängeÜberprüfen();
	
	}
	static String ersterString = "anna"; 
	static String zweiterString = "na  na";
	
	static List<Character> ersteZeichenketteArray  = new ArrayList<Character>();
	static List<Character> zweiteZeichenketteArray  = new ArrayList<Character>();
	
	
	public static void anagramInArray()
	{
		ersterString = ersterString.toLowerCase();
		zweiterString = zweiterString.toLowerCase();
		
		for(char c : ersterString.toCharArray())
		{
			ersteZeichenketteArray.add(c);
		}
		for(char c : zweiterString.toCharArray())
		{
			zweiteZeichenketteArray.add(c);
		}
		System.out.println(ersteZeichenketteArray);
		System.out.println(zweiteZeichenketteArray);
		for(int i=0;i<ersteZeichenketteArray.size();i++ )
		{
			if(ersteZeichenketteArray.get(i) == 32)
			{
				ersteZeichenketteArray.remove(i);
			}
			
		}
		for(int i=0;i<zweiteZeichenketteArray.size();i++ )
		{
			if(zweiteZeichenketteArray.get(i) == 32)
			{
				zweiteZeichenketteArray.remove(i);
			}
			
		}
		System.out.println(ersteZeichenketteArray);
		System.out.println(zweiteZeichenketteArray);

	}
	public static void anagramLängeÜberprüfen()
	{
		if(ersteZeichenketteArray.size() == zweiteZeichenketteArray.size())
		{
			anagramÜberprüfen();
		}else{
			System.out.println("Es handelt sich nicht um ein Anagram");
		}
	}
	
	public static void anagramÜberprüfen()
	{
		for(int i=0;i<ersteZeichenketteArray.size();i++)
		{
			for(int j=0;j<zweiteZeichenketteArray.size();j++)
			{
				if(ersteZeichenketteArray.get(i)== zweiteZeichenketteArray.get(j))
				{
					zweiteZeichenketteArray.remove(j);
				}
			}
			System.out.println(zweiteZeichenketteArray);
		}
		if(zweiteZeichenketteArray.size()== 0)
		{
			System.out.println("Es handelt sich um ein Anagram");
		}else{
			System.out.println("Es handelt sich nicht um ein Anagram");
		}
		
	}
	

}
