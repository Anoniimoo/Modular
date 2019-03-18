public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, int idade, int sexo, String cpf, String endereco, String cidade, String uf, int telefone, int cep) {
        super(nome, idade, sexo, endereco, cidade, uf, telefone, cep);
        setCpf(cpf);
    }

    public PessoaFisica(String nome) {
        super(nome, 0, 1, null, null, null, 0, 0);
        setCpf("xxx.xxx.xxx-xx");
    }

    public PessoaFisica(){
        super("Jorge", 0, 1, null, null, null, 0, 0);
        setCpf("xxx.xxx.xxx-xx");
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null || cpf != "")
            this.cpf = cpf;
    }
}
