//4. Para a lista da questão anterior, conte quantos números são pares
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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

        int qtdPares = lista.contarPares();
        System.out.println("Quantidade de números pares: " + qtdPares);

        entrada.close();
    }
}
