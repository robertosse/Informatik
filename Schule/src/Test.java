
public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		java.awt.Point player = new java.awt.Point();
		player.x = player.y = 10;
		
		java.awt.Point door = new java.awt.Point();
		door.setLocation(10, 100);
		
		System.out.println(player);
		System.out.println(player.toString().length());
		
		long size = new java.io.File( "file.txt" ).length();
		System.out.println(size);
		
		System.out.println("Hallo\t Haaal");

	}

}



