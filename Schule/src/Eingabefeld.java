
import javax.swing.*;
import java.util.*;

public class Eingabefeld
{
	
	public static void main(String[] args)
	{
		passwortÜberprüfen();
	}
	static String passwort2;
	static Scanner passwortScanner = new Scanner(System.in);
	static String passwort1 = JOptionPane.showInputDialog("Bitte Passwort eingeben:");
	
	
	public static void passwortÜberprüfen()
	{
		passwort2 = passwortScanner.nextLine();
		
		if (passwort1.equals(passwort2))
		{
			System.out.println("Passwort korrekt");
			kontostand();
			
		}else{
			System.out.println("Passwort falsch");
		}
		
		
	}
	
	public static void kontostand()
	{
		System.out.println("Ihr Kontostand beträgt 20,72€");
	}
}	

