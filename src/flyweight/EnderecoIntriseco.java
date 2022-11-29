package flyweight;

public class EnderecoIntriseco implements EnderecoInterface {

	private String nome;
	private int numero;

	public EnderecoIntriseco(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}

	@Override
	public void entrega(Endereco endereco) {
		System.out.println("Entrega para: " + this.nome);
		System.out.println("Número: " + this.numero);
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("\n");
	}
	
	public Endereco validateFlyweight(String cidade, String bairro, Endereco endereco) {
		if(endereco.getBairro() == bairro && endereco.getCidade() == cidade) {
			return endereco;
		}
		return new Endereco(cidade, bairro);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
