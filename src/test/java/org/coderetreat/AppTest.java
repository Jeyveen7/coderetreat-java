package org.coderetreat;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void testApp() {
        assertThat("Hello World", equalTo(new App().sayHello()));
    }
}
