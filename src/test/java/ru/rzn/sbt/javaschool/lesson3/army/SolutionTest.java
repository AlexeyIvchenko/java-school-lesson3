package ru.rzn.sbt.javaschool.lesson3.army;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void armyEqualsTest() {
        Object [][] expectedData = {
                {new Warrior[] {new Warrior(10)}, new Warrior[] {new Warrior(10)}, true},
                {new Warrior[] {new Warrior(10)}, null, false},
                {new Warrior[] {null}, new Warrior[] {new Warrior(10)}, false},
                {new Warrior[] {new Warrior(10)}, new Warrior[] {}, false},
                {new Warrior[] {}, new Warrior[] {new Warrior(10)}, false},
                {new Warrior[] {new Warrior(10)}, new Warrior[] {new Warrior(10), new Warrior(10)}, false},
                {new Warrior[] {new Warrior(10), new Warrior(20)}, new Warrior[] {new Warrior(10), new Warrior(20)}, true},
                {new Warrior[] {new Warrior(10), new Warrior(20)}, new Warrior[] {new Warrior(10), new Warrior(30)}, false},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(20)}, new Warrior[] {new Warrior(10), new Warrior(20)}, false},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, true},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, new Warrior[] {new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20), new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10)}, false},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, new Warrior[] {new Warrior(new Weapon(WeaponType.SPEAR, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, false},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 3, 300), 20)}, false},
                {new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 1000), 10), new Warrior(new Weapon(WeaponType.BOW, 2, 300), 20)}, new Warrior[] {new Warrior(new Weapon(WeaponType.SWORD, 5, 2500), 10), new Warrior(new Weapon(WeaponType.BOW, 3, 300), 20)}, false},
        };

        for(Object[] test: expectedData) {
            boolean result = Solution.armyEquals((Warrior[])test[0], (Warrior[])test[1]);
            assertEquals(test[2], result);
        }
    }
}