package hello
import org.springframework.stereotype.Controller
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 * Request Mapping is used to establish HTTP connection
 */
@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
@RequestMapping(value= Array("/"))
class HelloConfig {
   @RequestMapping(method=Array(RequestMethod.GET))
        @ResponseBody
        def home():String=  {     
        return "Hello World!";
}
}
