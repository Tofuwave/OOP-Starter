package cofrinho;

public class Euro extends Moeda{
	//construtor para valor especifico de euro
    public Euro(double valor) {
        super(valor);
    }
    
    //retorna print com o valor adicionado de euro
    @Override
    public String toString() {
        return "Euro -> " + String.format("%.2f", valor);
        }

}
