package ru.skubatko.dev.skillsmart.ooap.characters.enemy;

public class EnemyFactory {

    public static Enemy create(String type) {
        switch (type) {
            case "wolf":
                return new WolfEnemy();
            case "bear":
                return new BearEnemy();
            case "snake":
                return new SnakeEnemy();
            case "boar":
                return new BoarEnemy();
            case "witch":
                return new WitchEnemy();
            case "bull":
                return new BullEnemy();
            default:
                throw new IllegalArgumentException();
        }
    }
}
