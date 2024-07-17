package ApliPilas1;
import java.util.Scanner;
public class ApliPilas_1 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int N = lee.nextInt();
		Pila Z = new Pila(100); // creacion de nueva Pila denominada Z de tamaño 100
		int c=0;
		// inserta N elementos en la pila Z de manera aleatoria
		while (c < N)
		{
		int it = (int)(Math.random()*100+1);
		Z.inserta(it);
		c++;
		}
		// obtiene la media de los elementos de la Pila Z
		Pila Q = new Pila(N); // creacion de pila auxiliar Q para guardar los 
		int m=0; // elementos eliminados de la Pila Z
		while(!Z.estaVacia()){
		int it = Z.elimina();
		m = m + it;
		Q.inserta(it);
		}
		m=m/N;
		System.out.println("Media = "+m); //Muestra la media de elementos de Pila Z
		// vaciamos la pila auxiliar Q a la Pila Z 
		while(!Q.estaVacia()){
		int it = Q.elimina();
		Z.inserta(it);
		}
		// Muestra los elementos de la Pila Z 
		while (!Z.estaVacia()) { 
		int it = Z.elimina();
		System.out.println(it); // muestra el elemento eliminado
		Q.inserta(it); // Uso de Pila auxiliar Q ya creada
		} 
		// nuevamente vaciamos la pila auxiliar Q a la Pila Z 
		while(!Q.estaVacia()){
		int it = Q.elimina();
		Z.inserta(it);
		}
		}
		}
}