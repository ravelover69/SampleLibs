package src;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Sid on 01/05/2017.
 */
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class MyProperties {

    private String name;
    private String email;


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
};