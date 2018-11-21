package com.apps.module1.unittest;

import com.apps.module1.Module1;

import org.junit.*;
import static junit.framework.TestCase.*;

public class Module1Test {
    @Test
    public void testModule1() {
        Module1 buddy = new Module1();

        assertEquals("Module1 result: Hello world!", buddy.sayHello());
    }
}
