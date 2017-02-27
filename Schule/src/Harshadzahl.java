
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;

public class Harshadzahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		umwandeln();
		überprüfen();
	
	}
		static int harshadzahl = 22;
		static String stringZahl = String.valueOf(harshadzahl) ;
		static List<Character> zahlenArray = new ArrayList<Character>();
		
				
		public static void umwandeln()
		{
			zahlenArray = stringZahl.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
			System.out.println(zahlenArray);
		}

		public static void überprüfen()
		{
			int quersumme = 0;
			for(int i=0; i<zahlenArray.size(); i++)
			{
				quersumme = quersumme + zahlenArray.get(i) -48;
			}
			System.out.println(quersumme);
			int rest = harshadzahl % quersumme ;
			if (rest == 0)
			{
				System.out.println("Die Zahl " + harshadzahl + " ist eine Harshad-Zahl");
			}else{
				System.out.println("Die Zahl " + harshadzahl + " ist keine Harshad-Zahl");
			}
		}
		
}
