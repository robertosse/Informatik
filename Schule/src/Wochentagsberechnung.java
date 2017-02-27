

public class Wochentagsberechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	tagesAnzahl();
	wochentag();
	}
	static int tag= 22 ;
	static int monat= 1;
	static int jahr = 1992 ;
	static int gesamtAnzahlTage = 0;

	public static void tagesAnzahl()
	{
		int anzahlJahre = jahr - 1900;
		int anzahlTage = anzahlJahre * 365;
		int schaltjahre = (jahr - 1900)/ 4;
		int monatstage = 0;
		
		for( int i=1;i< monat ; i++)
		{	
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{

				 
				monatstage = monatstage + 31; 
			}else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				monatstage = monatstage + 30;
			}else if (i == 2)
			{
				monatstage = monatstage + 28;
			}
			
		}	
		if(jahr % 4 == 0)
		{
			if(monat >= 3)
			{
				gesamtAnzahlTage= 1;
			}
		}
		gesamtAnzahlTage = anzahlTage + schaltjahre + monatstage + tag;
		System.out.println(gesamtAnzahlTage);
		
	}
	
	public static void wochentag()
	{
		int wochentag = gesamtAnzahlTage % 7;
		switch (wochentag)
		{
			case (0):System.out.println("Sonntag");
			break;
			case(1):System.out.println("Montag");
			break;
			case(2):System.out.println("Dienstag");
			break;
			case(3):System.out.println("Mittwoch");
			break;
			case(4):System.out.println("Donnerstag");
			break;
			case(5):System.out.println("Freitag");
			break;
			case(6):System.out.println("Samstag");

		}
		
		
	}

}
