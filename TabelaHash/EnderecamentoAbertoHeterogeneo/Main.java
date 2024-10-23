package TabelaHash.EnderecamentoAbertoHeterogeneo;

public class Main {
    public static void main(String[] args) {
        Hash hashTable = new Hash(10); // Tamanho total da tabela hash

        // Inserindo elementos
        // Testando inserções
        System.out.println("Testando inserções:");
        System.out.println("Inserindo: 10");
        hashTable.insert(10);
        hashTable.printHashTable();

        System.out.println("Inserindo: 20");
        hashTable.insert(20);
        hashTable.printHashTable();

        System.out.println("Inserindo: 30");
        hashTable.insert(30);
        hashTable.printHashTable();

        System.out.println("Inserindo: 40");
        hashTable.insert(40);
        hashTable.printHashTable();

        System.out.println("Inserindo: 50");
        hashTable.insert(50);
        hashTable.printHashTable();

        System.out.println("Inserindo: 60");
        hashTable.insert(60);
        hashTable.printHashTable();

        System.out.println("Inserindo: 15");
        hashTable.insert(15);
        hashTable.printHashTable();

        // Testando busca
        System.out.println("Testando busca:");
        System.out.println("Encontrou 30? " + hashTable.find(30));
        System.out.println("Encontrou 70? " + hashTable.find(70)); // Não deve encontrar

        // Testando remoção
        System.out.println("Testando remoção:");
        System.out.println("Removido 30: " + hashTable.remove(30)); // Deve remover com sucesso
        System.out.println("Removido 70: " + hashTable.remove(70)); // Não deve encontrar para remover
        hashTable.printHashTable();
    }
}
