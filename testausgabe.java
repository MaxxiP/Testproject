
public class testausgabe {

	public static void main(String[] args) {
		zaehl();
		zaehlback();
		bye();
	}

	//Neue Methode
	public static void zaehl(){
		for(int i = 0;i<100;i++){
			System.out.println(i);
		}
		
	}
	
	public static void bye(){
		System.out.println("Danke für das ausführen meines Programmes.");
	}
	
	public static void zaehlback(){
		
		for(int j =100;j<0;j--){
			System.out.println(j);
		}
	}
}
