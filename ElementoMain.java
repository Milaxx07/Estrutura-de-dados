//2. Crie uma lista encadeada de números. Insira vários números no final da lista. Conte quantos números são maiores que 10.
import java.util.Scanner;
public class ElementoMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ListaEncadeada lista = new ListaEncadeada();
            
            System.out.println("Digite números para adicionar à lista (digite 0 para parar):");
            
            int numero;
            do {
                System.out.print("Número: ");
                numero = sc.nextInt();
                if (numero != 0) {
                    lista.inserirFinal(numero);
                }
            } while (numero != 0);
            
            System.out.println("\nLista encadeada:");
            lista.mostrarLista();
            
            int qtd = lista.contarMaioresQue10();
            System.out.println("Quantidade de números maiores que 10: " + qtd);
        }
    }
}
