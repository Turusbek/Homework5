package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Boss boss = new Boss(500,50,"Defence");
        System.out.println("Тип зашиты босса:"+boss.getBossDefenceType());
        System.out.println("Урон босса:"+boss.getDamage());
        System.out.println("Здоровье босса:"+boss.getHealth());

    }
    }
