package TabelaHash.TabelaHashComum;

public class Hash {
    private int[] hashTable;
    

    public Hash() {
        hashTable = new int[10];
    }

    private int functionHash(int num) {
        return num % 10;
    }

    public void add(int num) {
        int index = functionHash(num);
        if (hashTable[index] == 0) {
            hashTable[index] = num;
        } else {
            System.out.println("Colisão ao inserir " + num + " na posição " + index);
        }
    }

    public boolean find(int num) {
        int index = functionHash(num);
        return hashTable[index] == num;
    }


    public int remove(int num) {
        int index = functionHash(num);
        if (hashTable[index] == num) {
            int value = hashTable[index];
            hashTable[index] = 0;
            return value;
        } else {
            System.out.println("Chave " + num + " não encontrada para remoção.");
            return 0;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Posição " + i + ": " + hashTable[i]);
        }
    }
}
