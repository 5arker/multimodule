package com.apps;

import com.apps.module1.Module1;
import com.apps.module2.Module2;
import com.apps.module3.Module3;
import com.apps.module4.Module4;


public class HiFi {
    public static void main(String[] argv) {
  
    Module1 buddy1 = new Module1();
    Module2 buddy2 = new Module2();
    Module3 buddy3 = new Module3();
    Module4 buddy4 = new Module4();

    System.out.println(buddy1.sayHello());
    System.out.println(buddy2.sayHello());
    System.out.println(buddy3.sayHello());
    System.out.println(buddy4.sayHello());
      
    }
}
