
public class testausgabe {

	public static void main(String[] args) {
		zaehl();
		bye();
	}

	//Neue Methode
	public static void zaehl(){
		int zahl = 0;
		for(int i = 0;i<100;i++){
			zahl++;
			System.out.println(zahl);
		}
		
	}
	
	public static void bye(){
		System.out.println("Danke für das ausführen meines Programmes.");
	}
}
