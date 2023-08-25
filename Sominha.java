package teste;




class Sominha {
	//scanner
	
	
	public static void main(String args[]) {
		
		//variaveis
		int a, b, resultado;
		
		//solicitando valores
		System.out.println("Digite um numero");
		a = MyIO.readInt();
		
		System.out.println("Digite outro numero");
		b = MyIO.readInt();
		
		//calculando a soma
		resultado = a+b;
		
		//resultados
		System.out.println("Soma: " + resultado);
		
		
	}
}
