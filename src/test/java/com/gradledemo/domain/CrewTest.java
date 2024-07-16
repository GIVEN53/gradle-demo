package com.gradledemo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CrewTest {

    @Test
    void 크루를_생성한다() {
        Crew crew = new Crew("prin");
        assertThat(crew.getName()).isEqualTo("prin");
    }

    private static class Crew {
        private final String name;

        public Crew(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
