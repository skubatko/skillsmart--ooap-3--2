package ru.skubatko.dev.skillsmart.ooap.world;

import ru.skubatko.dev.skillsmart.ooap.world.locations.AsgardLocation;
import ru.skubatko.dev.skillsmart.ooap.world.locations.EtunchaimLocation;
import ru.skubatko.dev.skillsmart.ooap.world.locations.IcePlainLocation;
import ru.skubatko.dev.skillsmart.ooap.world.locations.IronForestLocation;
import ru.skubatko.dev.skillsmart.ooap.world.locations.LakeLocation;
import ru.skubatko.dev.skillsmart.ooap.world.locations.Location;
import ru.skubatko.dev.skillsmart.ooap.world.locations.MountainsLocation;

public class LocationFactory {

    public static Location create(String type) {
        switch (type) {
            case "asgard":
                return new AsgardLocation();
            case "etunchaim":
                return new EtunchaimLocation();
            case "ice-plain":
                return new IcePlainLocation();
            case "iron-forest":
                return new IronForestLocation();
            case "lake":
                return new LakeLocation();
            case "mountains":
                return new MountainsLocation();
            default:
                throw new IllegalArgumentException();
        }
    }
}
