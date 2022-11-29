package flyweight;

public class Endereco {
	private String cidade;
	private String bairro;
	
	public Endereco(String cidade, String bairro) {
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}
}
