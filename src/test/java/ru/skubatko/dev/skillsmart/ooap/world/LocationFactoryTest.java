package ru.skubatko.dev.skillsmart.ooap.world;

import static org.assertj.core.api.Assertions.assertThat;

import ru.skubatko.dev.skillsmart.ooap.world.locations.Location;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

class LocationFactoryTest {

    @SneakyThrows
    @Test
    void testLocationCreation() {
        // given
        String locationType = "asgard";

        // when
        Location actual = LocationFactory.create("asgard");

        // then
        assertThat(actual.getName()).isEqualTo((locationType));
    }
}
