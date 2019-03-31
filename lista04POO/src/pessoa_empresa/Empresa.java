package pessoa_empresa;
public class Empresa {

    private Lista clientes;
    private Lista funcionarios;
    private String nome, endereco, cidade, uf;
    private int telefone, cep;
    private Funcionario presidente;

    public Empresa(String nome, String endereco, String cidade, String uf, int telefone, int cep, Funcionario presidente){
        this.clientes = new Lista();
        this.funcionarios = new Lista();
        setEndereco(endereco);
        setCidade(cidade);
        setUf(uf);
        setTelefone(telefone);
        setCep(cep);
        setPresidente(presidente);
    }

    public Empresa(){
        this.clientes = new Lista();
        this.funcionarios = new Lista();
    }

    public void adicionarClienteFisico(ClienteFisico cliente){
        this.clientes.adicionaFim(cliente);
    }

    public void adicionarClienteJuridico(ClienteJuridico cliente){
        this.clientes.adicionaFim(cliente);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.adicionaFim(funcionario);
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

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }
}
