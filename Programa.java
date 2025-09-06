//3. Para a lista encadeada da questão anterior, mostre o somatório dos números maiores e menores do que 10
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        
    
        try (Scanner entrada = new Scanner(System.in)) {
            ListaNumeros lista = new ListaNumeros();
            
            System.out.println("Digite números para adicionar (0 encerra):");
            
            int valor;
            do {
                System.out.print("Número: ");
                valor = entrada.nextInt();
                if (valor != 0) {
                    lista.adicionarNoFim(valor);
                }
            } while (valor != 0);
            
            System.out.println("\nLista:");
            lista.exibirLista();
            
            lista.somarMaioresEMenoresQue10();
        }
    }
}
