package com.apps.module2.unittest;

import com.apps.module2.Module2;

import org.junit.*;
import static junit.framework.TestCase.*;

public class Module2Test {
    @Test
    public void testModule2() {
        Module2 buddy = new Module2();

        assertEquals("Module2 result: Hello world!", buddy.sayHello());
    }
}
