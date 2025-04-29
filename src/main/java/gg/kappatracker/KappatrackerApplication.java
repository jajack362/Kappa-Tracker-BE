package gg.kappatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KappatrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KappatrackerApplication.class, args);
    }

}
