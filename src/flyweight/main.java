package flyweight;

public class main {
	  public static void main(String[] args) {
		  
		  EnderecoIntriseco intriseco = new EnderecoIntriseco("Rio do Sul", "Centro");
		  
		  Endereco entrega1 = new Endereco("João", 90);
		  Endereco entrega2 = new Endereco("Pedro", 257);
		  
		  entrega1.entrega(intriseco.getCidade(), intriseco.getBairro());
		  entrega2.entrega(intriseco.getCidade(), intriseco.getBairro());
	  }
}	
