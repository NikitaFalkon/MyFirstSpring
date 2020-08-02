package bu.nikita.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(){
    return "First/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
    return "First/goodbye";
    }
}
