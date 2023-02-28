package ru.skubatko.dev.skillsmart.ooap.characters.boss;

import ru.skubatko.dev.skillsmart.ooap.world.LocationFactory;
import ru.skubatko.dev.skillsmart.ooap.world.locations.Location;

import java.util.Set;

public class FenrirBossEnemy extends BossEnemy {

    @Override
    public Set<Location> getLocations() {
        return Set.of(LocationFactory.create("iron-forest"));
    }
}
