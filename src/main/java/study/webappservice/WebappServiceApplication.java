package study.webappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebappServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebappServiceApplication.class, args);
    }

}
