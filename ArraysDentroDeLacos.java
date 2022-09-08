package Arrays;

public class ArraysDentroDeLacos {

	public static void main(String[] args) {
	
	int[] idades = new int[5]; //criando array de cinco posições
	
	//Laços com Arrays
    
    for (int i = 0; i < idades.length; i++) {
        idades[i] = i * i;
    }
    
    for (int i = 0; i < idades.length; i++) {
        System.out.println(idades[i]);
    }

	
	}
}
