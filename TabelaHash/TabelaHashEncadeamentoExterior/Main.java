package TabelaHash.TabelaHashEncadeamentoExterior;

public class Main {
    public static void main(String[] args) {
        // Cria uma tabela hash com tamanho 10
        Hash hashTable = new Hash(10);

        // Testando inserção
        System.out.println("Inserindo valores:");
        hashTable.insert(5);
        hashTable.insert(15); // Colisão com 5 (5 e 15 têm o mesmo índice)
        hashTable.insert(25); // Colisão com 5 e 15
        hashTable.insert(10);
        hashTable.insert(20);

        // Imprimindo a tabela hash após inserções
        hashTable.printHashTable();

        // Testando busca
        System.out.println("\nBuscando valores:");
        System.out.println("Encontrou 15? " + hashTable.find(15)); // Deve retornar true
        System.out.println("Encontrou 30? " + hashTable.find(30)); // Deve retornar false

        // Testando remoção
        System.out.println("\nRemovendo valores:");
        System.out.println("Removido: " + hashTable.remove(15)); // Deve remover 15
        System.out.println("Removido: " + hashTable.remove(30)); // Deve retornar -1 (não encontrado)

        // Imprimindo a tabela hash após remoções
        hashTable.printHashTable();

        // Removendo outro valor
        System.out.println("\nRemovendo 5:");
        hashTable.remove(5);

        // Imprimindo a tabela hash final
        hashTable.printHashTable();
    }
}
