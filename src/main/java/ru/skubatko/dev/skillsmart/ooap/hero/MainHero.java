package ru.skubatko.dev.skillsmart.ooap.hero;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MainHero {
    private final String type;
    private final String exp;
    private final String health;
}
