import java.awt.Component;
import java.util.*;

import javax.swing.JOptionPane;

public class Bank {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		erstens();
	}

	static List benutzernameList = new ArrayList ();
	static List passwortList = new ArrayList();
	static List <Integer> kontostandList = new ArrayList();
	private static Component YES_NO_OPTION;
	static int indexPasswort;
	
	public static void erstens()
	{
		int auswahl = JOptionPane.showOptionDialog(null, "Registrieren oder Anmelden?", "Auswahl", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Registrieren", "Anmelden"}, "Anmelden");
		if (auswahl == 0)
		{
			registrieren();
			überprüfen();
			System.out.println(benutzernameList);
			System.out.println(passwortList);
		}else if (auswahl == 1){
			überprüfen();
			
		}
	}
	
	
	public static void registrieren()
	{
		benutzernameList.add(JOptionPane.showInputDialog("Bitte geben Sie einen Benutzernamen an:"));
		passwortList.add(JOptionPane.showInputDialog("Bitte geben Sie ein Passwort an:"));
		kontostandList.add(0);
		
	}
	
	public static void überprüfen()
	{
		
		String benutzername = JOptionPane.showInputDialog("Bitte geben Sie Ihren Benutzernamen ein: ");
		String passwort = JOptionPane.showInputDialog("Bitte geben Sie Ihr Passwort ein: ");
		indexPasswort = benutzernameList.indexOf(benutzername);
		if (passwort.equals(passwortList.get(indexPasswort)))
		{
			System.out.println("Sie sind angemeldet");
			System.out.println("Aktueller Kontostand : " + kontostandList.get(indexPasswort));
			programm();
		}else{
			System.out.println("Passwort falsch");
			erstens();
		}	
	}
	
	public static void programm()
	{
		int auswahl = JOptionPane.showOptionDialog(null, "Was wollen Sie machen?", "Auswahl", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Beenden", "Einzahlung", "Auszahlung"}, "Einzahlung");
		System.out.println(auswahl);
		if (auswahl == 0)
		{
			System.out.println("Auf Wiedersehen");
			erstens();
		}else if (auswahl == 1){
			einzahlen();	
		}else if (auswahl == 2){
			auszahlen();
		}
	}
	
	public static void einzahlen()
	{
		String einzahlenString = JOptionPane.showInputDialog("Wie viel möchten Sie einzahlen:");
		int einzahlenInteger = Integer.valueOf(einzahlenString);
		System.out.println(einzahlenInteger);
		int alterKontostand = kontostandList.get(indexPasswort);
		int neuerKontostand = alterKontostand + einzahlenInteger;
		kontostandList.set(indexPasswort, neuerKontostand);
		System.out.println("Neuer Kontostand: "+ kontostandList.get(indexPasswort));
		programm();
		
	}
	public static void auszahlen()
	{
		String auszahlenString = JOptionPane.showInputDialog("Wie viel möchten Sie ausgezahlt haben: ");
		int auszahlenInteger = Integer.valueOf(auszahlenString);
		int alterKontostand = kontostandList.get(indexPasswort);
		int neuerKontostand =  alterKontostand - auszahlenInteger;
		if (neuerKontostand < 0)
		{
			System.out.println("Zu wenig Geld auf dem Konto");
		}else{
			kontostandList.set(indexPasswort, neuerKontostand);
			System.out.println("Neuer Kontostand: "+ kontostandList.get(indexPasswort));
		}
		programm();	
		
				
	}
}
