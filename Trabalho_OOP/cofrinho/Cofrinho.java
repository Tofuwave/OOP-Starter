package cofrinho;
import java.util.ArrayList;

public class Cofrinho {
	  //Declara Array privado como atributo 
	  private ArrayList<Moeda> moedas;

	  //inicializa atributo criando uma nova instância dentro de Cofrinho
	  public Cofrinho() {
	    moedas = new ArrayList<>();
	  }

	  //metodo adicionarMoeda
	  public void adicionarMoeda(Moeda moeda){
	    moedas.add(moeda);
	  }

	  //metodo removerMoeda
	  public void removerMoeda(int indice) {
	    moedas.remove(indice);
	  }

	  //metodo listarMoedas
	  public void listarMoedas(){
	    System.out.println("Moedas no cofrinho:");
	    for (Moeda moeda : moedas) {
	      System.out.println(moeda);
	    }
	  }

	  //metodo converter moedas
	  public double calcularTotalEmReais() {
	  double total = 0;
	  for (Moeda moeda : moedas) {
	    if (moeda instanceof Real) {
	      total += moeda.getValor();
	      } else if (moeda instanceof Dolar) {
	          total += moeda.getValor() * 5; // valor hipotético Dolar -> Real 
	      } else if (moeda instanceof Euro) {
	          total += moeda.getValor() * 6; // valor hipotético Euro -> Real 
	      }
	  }
	    return total;
	  }

}
