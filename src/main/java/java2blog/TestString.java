package java2blog;

public class TestString {
	public static void main(String[] args) {
		String  teste = "Izaias Dantas Barreto";
		
		//String[] separado = teste.split(" ");
		String[] separado = teste.split("\s");
		
		for (String value : separado) {
			System.out.println(value);	
		}
		
	}
}
