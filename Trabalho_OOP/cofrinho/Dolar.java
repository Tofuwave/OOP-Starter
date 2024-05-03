package cofrinho;

public class Dolar extends Moeda{
	  //construtor para valor especifico de dolar
    public Dolar(double valor) {
        super(valor);
    }

    //retorna print com o valor adicionado de dolar
    @Override
    public String toString() {
        return "Dolar -> " + String.format("%.2f", valor);
    }

}
