package pl.edu.vistula.first_project_java_spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello"; // This matches index.html
    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name",required = false, defaultValue ="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
