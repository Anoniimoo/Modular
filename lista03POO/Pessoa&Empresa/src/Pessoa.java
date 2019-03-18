public class Pessoa {
    protected String nome;
    protected int idade, sexo;
    private String endereco, cidade, uf;
    private int telefone, cep;



    public Pessoa(String nome, int idade, int sexo, String endereco, String cidade, String uf, int telefone, int cep) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setEndereco(endereco);
        setCidade(cidade);
        setUf(uf);
        setTelefone(telefone);
        setCep(cep);
    }

    public Pessoa(){
        setNome(null);
        setIdade(0);
        setSexo(1);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMaiorDeIdade(){
        boolean eMaior;
        eMaior = this.idade >= 18;
        return eMaior;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
