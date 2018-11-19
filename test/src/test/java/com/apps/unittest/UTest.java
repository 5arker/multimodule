package com.apps.unittest;

import com.apps.module1.Module1;
import com.apps.module2.Module2;
import com.apps.module3.Module3;
import com.apps.module4.Module4;

import org.junit.*;
import static junit.framework.TestCase.*;

public class UTest {
    @Test
    public void testModule1() {
        Module1 buddy = new Module1();

        assertEquals("Module1 result: Hello world!", buddy.sayHello());
    }

    @Test
    public void testModule2() {
        Module2 buddy = new Module2();

        assertEquals("Module2 result: Hello world!", buddy.sayHello());
    }

    @Test
    public void testModule3() {
        Module3 buddy = new Module3();

        assertEquals("Module3 result: Hello world!", buddy.sayHello());
    }

    @Test
    public void testModule4() {
        Module4 buddy = new Module4();

        assertEquals("Module4 result: Hello world!", buddy.sayHello());
    }
}
