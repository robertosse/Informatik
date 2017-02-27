
import javax.swing.*;

public class Klausur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prozentErrechnen();
	}
	
	static String bewertungseinheiten = JOptionPane.showInputDialog("Erreichte Bewertungseinheiten eingeben: ");
	static String erreichbareBE = JOptionPane.showInputDialog("Erreichbare Bewertungseinheiten eingeben:");	
	static double doubleBE = Double.parseDouble(bewertungseinheiten);
	static double doubleErreichbareBE = Double.parseDouble(erreichbareBE);

	public static void prozentErrechnen()
	{
		doubleBE = doubleBE/doubleErreichbareBE;
		double prozent = doubleBE*100;
		System.out.println("Sie haben "+ prozent +" Prozent erreicht");
		
		
		
		if(prozent>= 95)
		{
			System.out.println("Dies entspricht 15 Punkten");
		}else if(90<= prozent   ){
			System.out.println("Dies entspricht 14 Punkten");
		}else if(85<= prozent   ){
			System.out.println("Dies entspricht 13 Punkten");
		}else if(80<= prozent   ){
			System.out.println("Dies entspricht 12 Punkten");
		}else if(75<= prozent   ){
			System.out.println("Dies entspricht 11 Punkten");
		}else if(70<= prozent   ){
			System.out.println("Dies entspricht 10 Punkten");
		}else if(65<= prozent   ){
			System.out.println("Dies entspricht 9 Punkten");
		}else if(60<= prozent   ){
			System.out.println("Dies entspricht 8 Punkten");
		}else if(55<= prozent   ){
			System.out.println("Dies entspricht 7 Punkten");
		}else if(50<= prozent   ){
			System.out.println("Dies entspricht 6 Punkten");
		}else if(45<= prozent   ){
			System.out.println("Dies entspricht 5 Punkten");
		}else if(36<= prozent   ){
			System.out.println("Dies entspricht 4 Punkten");
		}else if(27<= prozent   ){
			System.out.println("Dies entspricht 3 Punkten");
		}else if(18<= prozent   ){
			System.out.println("Dies entspricht 2 Punkten");
		}else if(9<= prozent   ){
			System.out.println("Dies entspricht 1 Punkt");
		}else if(0<= prozent   ){
			System.out.println("Dies entspricht 0 Punkten");
		} 
	}
}
