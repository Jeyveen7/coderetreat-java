package org.coderetreat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp() {
        assertThat("Hello World", equalTo(new App().sayHello()));
    }
}
