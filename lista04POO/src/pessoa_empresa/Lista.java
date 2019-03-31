package pessoa_empresa;
public class Lista {

    private Celula inicio, fim;
    private int qtd;

    public Lista(){
        inicio = new Celula();
        fim = inicio;
    }

    public void adicionaFim(Object valor){
        fim.setProx(new Celula(valor));
        fim.setValor(fim.getProx());
        qtd++;
    }

    public boolean vazia(){
        return inicio == fim;
    }

    public int quantidade() {
        return qtd;
    }
}
