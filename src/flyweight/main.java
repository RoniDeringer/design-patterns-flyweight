package flyweight;

public class main {
	  public static void main(String[] args) {
		  		  
		  Endereco endereco = new Endereco("Rio do Sul", "Centro");
		  
		  EnderecoIntriseco entrega1 = new EnderecoIntriseco("João", 90);
		  EnderecoIntriseco entrega2 = new EnderecoIntriseco("Pedro", 257);

		  entrega1.entrega(endereco);
		  entrega2.entrega(endereco);
	  }
}	
