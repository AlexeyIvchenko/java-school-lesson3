package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     * <p>
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     * <p>
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     * <p>
     * Не забудте проверку на null.
     */

    private static final char[] symbols = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static String decrypt(String encrypted) {
        StringBuilder stringBuilder = new StringBuilder();
        if (encrypted != null) {
            char[] stringSymbols = encrypted.toCharArray();
            for (int i = 0; i < stringSymbols.length; i++) {
                int decryptSymbolIndex = getLatinSymbolIndex(stringSymbols[i]);
                if (decryptSymbolIndex != -1) {
                    char decryptedSymbol = symbols[getDecryptSymbolIndex(decryptSymbolIndex)];
                    stringBuilder.append(Character.isUpperCase(stringSymbols[i]) ? Character.toUpperCase(decryptedSymbol) : decryptedSymbol);
                } else {
                    stringBuilder.append(stringSymbols[i]);
                }
            }
        } else return null;
        return stringBuilder.toString();
    }

    private static int getDecryptSymbolIndex(int encryptedSymbolIndex) {
        int decryptSymbolIndex = 0;
        if (encryptedSymbolIndex - 9 < 0) {
            decryptSymbolIndex = symbols.length - Math.abs(encryptedSymbolIndex - 9);
        } else {
            decryptSymbolIndex = encryptedSymbolIndex - 9;
        }
        return decryptSymbolIndex;
    }

    private static int getLatinSymbolIndex(char symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (Character.toLowerCase(symbol) == symbols[i]) {
                return i;
            }
        }
        return -1;
    }
}
