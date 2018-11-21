package com.apps.module4.unittest;

import com.apps.module4.Module4;

import org.junit.*;
import static junit.framework.TestCase.*;

public class Module4Test {
    @Test
    public void testModule4() {
        Module4 buddy = new Module4();

        assertEquals("Module4 result: Hello world!", buddy.sayHello());
    }
}
