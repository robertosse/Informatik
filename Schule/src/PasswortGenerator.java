

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PasswortGenerator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		teilw�rterInWort();
		System.out.println(passwort);
	}
	
	static String satz = "Wenn es regnet, dann wird es nass .";
	static List<String> teilw�rter = new ArrayList<String>(Arrays.asList(satz.split(" "))); 
	static boolean kleinerBuchstabe = false;
	static String passwort;
	
	
	public static void teilw�rterInWort()
	{
		for(String einzelw�rter : teilw�rter)
		{
			char endbuchstaben = einzelw�rter.charAt(einzelw�rter.length()-1);
			if(Character.isLetter(endbuchstaben))
			{
				if(kleinerBuchstabe)
				{
					endbuchstaben = Character.toLowerCase(endbuchstaben);
					kleinerBuchstabe = false;
				}else{
					endbuchstaben = Character.toUpperCase(endbuchstaben);
					kleinerBuchstabe = true;	
				}			
			}
			passwort = passwort + endbuchstaben;
			
		}
		
	}
	
	
	
	
}

