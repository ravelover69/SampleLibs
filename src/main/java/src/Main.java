package src;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


/**
 * Created by Sid on 01/05/2017.
 */

@SpringBootApplication
public class Main  implements CommandLineRunner {


    private static final Logger log = LoggerFactory.getLogger(Main.class);

    @Autowired
    private ApplicationContext appContext;

    public static void main (String [] args) {
        SpringApplication.run(Main.class, args);

    }

    public void run(String... args) throws Exception {

        String[] beans = appContext.getBeanDefinitionNames();
        MyProperties m = (MyProperties) appContext.getBean("myProperties");

        System.out.println ("Email: " + m.getEmail());
        System.out.println ("Name: " + m.getName());
       //for (String bean : beans) {
         //   System.out.println("Bean name: " + bean);
        //}

    }
}
