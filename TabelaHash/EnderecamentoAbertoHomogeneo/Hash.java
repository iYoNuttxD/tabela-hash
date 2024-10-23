package TabelaHash.EnderecamentoAbertoHomogeneo;

public class Hash {
    private Integer[] hashTable;
    private int size;
    

    public Hash(int size) {
        this.size = size;
        hashTable = new Integer[size];
    }

    private int functionHash(int num) {
        return num % size;
    }

    public void insert(int num) {
        int index = functionHash(num);
        if (hashTable[index] == null || hashTable[index] == -1) {
            hashTable[index] = num;
            return;
        } else {
            for (int i = index + 1; i < size; i++) {
                if (hashTable[i] == null || hashTable[i] == -1) {
                    hashTable[i] = num;
                    return;
                }
            }
            for (int i = 0; i <= index; i++) {
                if (hashTable[i] == null || hashTable[i] == -1) {
                    hashTable[i] = num;
                    return;
                }
            }
        }
        System.out.println("Tabela cheia, não é possível inserir " + num);
    }

    public boolean find(int num) {
        int index = functionHash(num);
        if (hashTable[index] != null && hashTable[index] == num) {
            return true;
        } else {
            for (int i = index + 1; i < size; i++) {
                if (hashTable[i] == null) {
                    break;
                } else if (hashTable[i] != -1 && hashTable[i] == num) {
                    return true;
                }
            }
            for (int i = 0; i <= index; i++) {
                if (hashTable[i] == null) {
                    break;
                } else if (hashTable[i] != -1 && hashTable[i] == num) {
                    return true;
                }
            }
        }
        return false;
    }


    public int remove(int num) {
        int index = functionHash(num);
        if (hashTable[index] != null && hashTable[index] == num) {
            hashTable[index] = -1;
            return num;
        } else {
            for (int i = index + 1; i < size; i++) {
                if (hashTable[i] == null) {
                    break;
                } else if (hashTable[i] != -1 && hashTable[i] == num) {
                    hashTable[i] = -1;
                    return num;
                }
            }
            for (int i = 0; i <= index; i++) {
                if (hashTable[i] == null) {
                    break;
                } else if (hashTable[i] != -1 && hashTable[i] == num) {
                    hashTable[i] = -1;
                    return num;
                }
            }
        }
        return -1;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            String value = (hashTable[i] == null) ? "null" : hashTable[i].toString();
            System.out.println("Posição " + i + ": " + value);
        }
    }
}
