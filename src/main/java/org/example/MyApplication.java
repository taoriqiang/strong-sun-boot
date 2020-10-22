package org.example;


import strong.sun.framework.annotation.ComponentScan;
import strong.sun.framework.annotation.JavaApplicationBoot;
import strong.sun.framework.config.JavaBootServletInitializer;
import strong.sun.framework.models.JavaBuilder;

@JavaApplicationBoot
@ComponentScan(value = "org.example")
public class MyApplication extends JavaBootServletInitializer {


    protected JavaBuilder configure(JavaBuilder javaBuilder) {
        return javaBuilder.sources(MyApplication.class);
    }

}

