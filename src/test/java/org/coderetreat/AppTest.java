package org.coderetreat;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp() {
        assertEquals("Hello World", new App().sayHello());
    }
}
