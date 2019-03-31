package pessoa_empresa;
public class ClienteJuridico extends PessoaJuridica {

    @SuppressWarnings("unused")
	private int limiteDeCredito;

    public ClienteJuridico(String nome, int idade, int sexo, String cnpj, int limiteDeCredito, String endereco, String cidade, String uf, int telefone, int cep) {
        super(nome, idade, sexo, cnpj, endereco, cidade, uf, telefone, cep);
        setLimiteDeCredito(limiteDeCredito);
    }

    public void setLimiteDeCredito(int limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
}
