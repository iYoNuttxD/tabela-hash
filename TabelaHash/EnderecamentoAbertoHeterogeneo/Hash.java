package TabelaHash.EnderecamentoAbertoHeterogeneo;

public class Hash {
    private Integer[] hashTable;
    private int sizeWithColision;
    private int sizeWithoutColision;
    private int indexFinalInsert;
    private int indexStartColision;
    

    public Hash(int size) {
        sizeWithColision = size;
        sizeWithoutColision = (int) (size * 0.7);
        hashTable = new Integer[size];
        indexFinalInsert = sizeWithoutColision - 1;
        indexStartColision = indexFinalInsert + 1;
    }

    public int getIndexStartColision() {
        return indexStartColision;
    }

    public int getIndexFinalInsert() {
        return indexFinalInsert;
    }

    private int functionHash(int num) {
        return num % sizeWithoutColision;
    }

    public void insert(int num) {
        int index = functionHash(num);
        if (index <= indexFinalInsert) {
            if (hashTable[index] == null) {
                hashTable[index] = num;
            } else {
                for (int i = indexStartColision; i < sizeWithColision; i++) {
                    if (hashTable[i] == null || hashTable[i] == -1) {
                        hashTable[i] = num;
                        return;
                    }
                }
                System.out.println("Tabela cheia, não é possível inserir " + num);
            }
        } else {
            System.out.println("Índice fora da área de inserção. Não é possível inserir " + num);
        }
    }

    public boolean find(int num) {
        int index = functionHash(num);
        if (hashTable[index] != null && hashTable[index] == num) {
            return true;
        } else {
            for (int i = indexStartColision; i < sizeWithColision; i++) {
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
            for (int i = indexStartColision; i < sizeWithColision; i++) {
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
