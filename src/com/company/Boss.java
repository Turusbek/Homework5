package com.company;

public class Boss {
    private int health;
    private int damage;
    private String bossDefenceType;

    public Boss(int health, int damage, String bossDefenceType) {
        this.health = health;
        this.damage = damage;
        this.bossDefenceType = bossDefenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
}
