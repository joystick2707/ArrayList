//Trabalho de Bryan Strey e Victor Luis

public class Main {
    public static void main(String[] args) {
        MeuArrayList lista = new MeuArrayList(2);
        lista.adicionar("Bryan");
        lista.adicionar("Lucas");
        lista.adicionar("Paulo");

        System.out.println("Elementos:");
        lista.imprimir();

        lista.remover(1);

        System.out.println("\nDepois de remover o índice 1:");
        lista.imprimir();
    }
}
