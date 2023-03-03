package ru.skubatko.dev.skillsmart.ooap.world;

import ru.skubatko.dev.skillsmart.ooap.world.locations.Location;

import lombok.Data;

import java.util.List;

@Data
public class World {
    private final List<Location> locations;
}
