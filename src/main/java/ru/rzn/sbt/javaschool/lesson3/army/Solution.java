package ru.rzn.sbt.javaschool.lesson3.army;

public class Solution {
    /**
     * Сравнение армий
     * <p>
     * 1. В классах {@link Warrior} и {@link Weapon} переопределите метод equals, чтобы можно было осуществлять
     * сравнение объектов
     * <p>
     * 2. Перепишите тело метода {{@link Solution#armyEquals(Warrior[], Warrior[])}} таким образом, чтобы она возвращал
     * true, если а) оба аргумента отличны от null, оба массива имеют одинаковый размер,  по одинаковым индексам в
     * массивах расположены равные объекты класса Warrior
     */
    public static boolean armyEquals(Warrior[] alpha, Warrior[] beta) {
        if (alpha == null || beta == null) return false;
        if (alpha.length == beta.length) {
            return compareObjectsInArray(alpha, beta);
        } else return false;
    }

    public static boolean compareObjectsInArray(Warrior[] alpha, Warrior[] beta) {
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != null) {
                if (!alpha[i].equals(beta[i])) return false;
            } else {
                if (beta[i] != null) return false;
            }
        }
        return true;
    }
}
