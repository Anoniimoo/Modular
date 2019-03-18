public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, int idade, int sexo, String cnpj, String endereco, String cidade, String uf, int telefone, int cep) {
        super(nome, idade, sexo, endereco, cidade, uf, telefone, cep);
        setCnpj(cnpj);
    }

    public PessoaJuridica(String nome) {
        super(nome, 0, 1, null, null, null, 0, 0);
        setCnpj("xx.xxx.xxx/xxxx-xx");
    }

    public PessoaJuridica(){
        super("Jorge.inc", 0, 1, null, null, null, 0, 0);
        setCnpj("xx.xxx.xxx/xxxx-xx");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj != null || cnpj != "")
            this.cnpj = cnpj;
    }
}
