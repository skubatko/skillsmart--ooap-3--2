package ru.skubatko.dev.skillsmart.ooap.hero;

public class MainHeroBuilder {

    public static MainHero create(String type) {
        return MainHero.builder().type(type).build();
    }
}
