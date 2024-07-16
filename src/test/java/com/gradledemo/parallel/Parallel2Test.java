package com.gradledemo.parallel;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Parallel2Test {

    @RepeatedTest(1000)
    void 병렬_테스트_2_실행() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
