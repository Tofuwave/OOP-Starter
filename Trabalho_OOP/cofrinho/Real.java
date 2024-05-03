package cofrinho;

public class Real extends Moeda{
	 //construtor para valor especifico de real
    public Real(double valor) {
        super(valor);
    }
    
    //retorna print com o valor adicionado de real
    @Override
    public String toString() {
        return "Real -> " + String.format("%.2f", valor);
    }

}
