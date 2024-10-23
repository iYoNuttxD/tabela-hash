package TabelaHash.TabelaHashEncadeamentoExterior;

import java.util.LinkedList;

public class Hash {
    private LinkedList<Integer>[] hashTable;
    private int size;

    // Construtor
    public Hash(int size) {
        this.size = size;
        hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int functionHash(int num) {
        return num % size;
    }

    public void insert(int num) {
        int index = functionHash(num);
        hashTable[index].add(num);
    }

    public boolean find(int num) {
        int index = functionHash(num);
        if (hashTable[index] == null) {
            return false;
        }
        for (int value : hashTable[index]) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }


    public int remove(int num) {
        int index = functionHash(num);
        if (hashTable[index] == null) {
            return -1;
        }
        for (int value : hashTable[index]) {
            if (num == value) {
                hashTable[index].remove((Integer) num);
                return num;
            }
        }
        return -1;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Posição " + i + ": " + hashTable[i]);
        }
    }
}
