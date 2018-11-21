package com.apps.module3.unittest;

import com.apps.module3.Module3;

import org.junit.*;
import static junit.framework.TestCase.*;

public class Module3Test {
    @Test
    public void testModule3() {
        Module3 buddy = new Module3();

        assertEquals("Module3 result: Hello world!", buddy.sayHello());
    }
}
