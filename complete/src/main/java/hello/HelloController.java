package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {
   @Autowired
   HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String test() {
        return "Greetings from Spring Boot! test " + helloService.isValid("4242424242426742") + " " + helloService.isValid("1111111111111111");
    }
}
