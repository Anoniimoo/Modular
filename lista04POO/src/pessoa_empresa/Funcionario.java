package pessoa_empresa;
public class Funcionario extends PessoaFisica {

    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, int sexo, String cpf, String cargo, double salario, String endereco, String cidade, String uf, int telefone, int cep){
        super(nome, idade, sexo, cpf, endereco, cidade, uf, telefone, cep);
        setCargo(cargo);
        setSalario(salario);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
