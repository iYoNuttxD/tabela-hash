package TabelaHash.EnderecamentoAbertoHomogeneo;

public class Main {
    public static void main(String[] args) {
        // Criação da tabela hash com um tamanho específico
        Hash hashTable = new Hash(10);

        System.out.println("Inserindo elementos:");
        hashTable.insert(5);
        hashTable.insert(15); // Deve colidir com 5
        hashTable.insert(25); // Deve colidir com 5 e 15
        hashTable.insert(3);
        hashTable.insert(7);
        hashTable.insert(17);
        hashTable.insert(27);
        hashTable.insert(30);
        hashTable.insert(9);
        hashTable.insert(12);
        hashTable.insert(8); // Tentativa de inserção em tabela cheia

        // Exibindo a tabela hash após inserções
        System.out.println("\nEstado da tabela hash após inserções:");
        hashTable.printHashTable();

        // Buscando elementos na tabela hash
        System.out.println("\nBuscando elementos:");
        System.out.println("Encontrado 15? " + hashTable.find(15));
        System.out.println("Encontrado 8? " + hashTable.find(8));
        System.out.println("Encontrado 3? " + hashTable.find(3));
        System.out.println("Encontrado 100? " + hashTable.find(100)); // Não deve ser encontrado

        // Removendo elementos da tabela hash
        System.out.println("\nRemovendo elementos:");
        System.out.println("Removido 15? " + hashTable.remove(15));
        System.out.println("Removido 8? " + hashTable.remove(8)); // Não deve ser encontrado

        // Exibindo a tabela hash após remoções
        System.out.println("\nEstado da tabela hash após remoções:");
        hashTable.printHashTable();
    }
}
