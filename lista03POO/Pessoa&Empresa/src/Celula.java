public class Celula {
    private Object valor;
    private Celula prox;

    public Celula(Object valor, Celula prox){
        this.valor = valor;
        this.prox = prox;
    }

    public Celula(Object valor){
        this.valor = valor;
        this.prox = null;
    }

    public Celula(){
        this.valor = null;
        this.prox = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }
}
