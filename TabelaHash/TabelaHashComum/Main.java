package TabelaHash.TabelaHashComum;

public class Main {
    public static void main(String[] args) {
        Hash tabela = new Hash();

        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};

        for (int valor : valores) {
            tabela.add(valor);
        }

        // Exibe a tabela após inserção
        System.out.println("Tabela após inserção:");
        tabela.printHashTable();

        // Busca por alguns valores
        System.out.println("\nBuscando valores:");
        System.out.println("Encontrou 25? " + tabela.find(25));
        System.out.println("Encontrou 50? " + tabela.find(50));

        // Remoção de um valor
        System.out.println("\nRemovendo 25:");
        tabela.remove(25);

        // Exibe a tabela após remoção
        System.out.println("Tabela após remoção:");
        tabela.printHashTable();
    }
}

