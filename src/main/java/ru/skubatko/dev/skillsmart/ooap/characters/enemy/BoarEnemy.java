package ru.skubatko.dev.skillsmart.ooap.characters.enemy;

import ru.skubatko.dev.skillsmart.ooap.world.LocationFactory;
import ru.skubatko.dev.skillsmart.ooap.world.locations.Location;

import java.util.Set;

public class BoarEnemy extends Enemy {

    @Override
    public Set<Location> getLocations() {
        return Set.of(
            LocationFactory.create("iron-forest")
        );
    }
}
