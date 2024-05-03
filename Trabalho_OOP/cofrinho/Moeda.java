package cofrinho;

public abstract class Moeda {
	//representação do valor da moeda
	  protected double valor;

	  //construtor da classe moeda que recebe parametro valor e atribui esse valor ao atributo valor da moeda
	  public Moeda(double valor) {
	    this.valor = valor;
	  }

	  //retorna o valor da moeda
	  public double getValor() {
	    return valor;
	  }

	  //metodo que retorna representação um forma de string do objeto moeda
	  public abstract String toString();

}
