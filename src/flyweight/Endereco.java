package flyweight;

public class Endereco implements EnderecoInterface {

	private String nome;
	private int numero;

	public Endereco(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}

	@Override
	public void entrega(String cidade, String bairro) {
		System.out.println("Entrega para: " + this.nome);
		System.out.println("Número: " + this.numero);
		System.out.println("Cidade: " + cidade);
		System.out.println("Bairro: " + bairro);
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
