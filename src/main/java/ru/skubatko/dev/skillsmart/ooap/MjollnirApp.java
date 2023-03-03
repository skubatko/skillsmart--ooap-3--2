package ru.skubatko.dev.skillsmart.ooap;

import ru.skubatko.dev.skillsmart.ooap.characters.boss.BearBossEnemy;
import ru.skubatko.dev.skillsmart.ooap.characters.boss.LynxBossEnemy;
import ru.skubatko.dev.skillsmart.ooap.characters.enemy.BullEnemy;
import ru.skubatko.dev.skillsmart.ooap.characters.enemy.Enemy;
import ru.skubatko.dev.skillsmart.ooap.characters.enemy.WolfEnemy;
import ru.skubatko.dev.skillsmart.ooap.hero.MainHero;
import ru.skubatko.dev.skillsmart.ooap.hero.MainHeroBuilder;
import ru.skubatko.dev.skillsmart.ooap.world.LocationFactory;
import ru.skubatko.dev.skillsmart.ooap.world.World;

import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.List;

@Slf4j
public class MjollnirApp {

    public static void main(String[] args) {
        MainHero hero = MainHeroBuilder.create(("archer"));
        log.info(("Main hero created"));

        val asgard = LocationFactory.create("asgard");
        val etunchaim = LocationFactory.create("etunchaim");
        val lake = LocationFactory.create("lake");
        World world = new World(List.of(asgard, etunchaim, lake));
        log.info(("World created"));

        Enemy lynxBossEnemy = new LynxBossEnemy();
        Enemy bearBossEnemy = new BearBossEnemy();
        Enemy bullEnemy = new BullEnemy();
        Enemy wolfEnemy = new WolfEnemy();
        log.info(("Enemies created"));
    }
}
