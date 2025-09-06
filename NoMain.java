//1. Crie uma lista encadeada para exibir uma fila de nomes clientes. Adicione clientes no final da lista e remova do início para testar.
public class NoMain {
    public static void main(String[] args) {
        FilaClientes fila = new FilaClientes();

        fila.enfileirar("Camila");
        fila.enfileirar("Maria");
        fila.enfileirar("João");
        fila.enfileirar("Yasmin");

        fila.mostrarFila();

        fila.desenfileirar();
        fila.mostrarFila();

        fila.desenfileirar();
        fila.mostrarFila();
    }
}
