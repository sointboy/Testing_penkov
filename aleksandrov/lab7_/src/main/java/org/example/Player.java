package org.example;

import weapons.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    public static Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            new Pistol("Пистолет","7 патронов"),
            new RPG("Ручной переносной гранатомет","1 ракета"),
            new Rifle("M4A4","30 патронов"),
            new Rogatka("Самодельная рогатка","5 Камней"),
            new WaterGun("Водяной пистолет","430 мл.")
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        if(slot > weaponSlots.length){
            System.out.println("Некорректное значение");
            System.exit(1);
        }
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}


