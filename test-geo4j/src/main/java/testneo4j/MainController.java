package testneo4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
 
    @Autowired
    private PersonRepository personRepository;
 
    @ResponseBody
    @RequestMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/showAllPerson'>Show All Person</a></li>";
        html += "</ul>";
        return html;
    }
    
    @ResponseBody
    @RequestMapping("/showAllPerson")
    public String showAllProduct() {
 
        List<Person> persons = this.personRepository.findAll();
 
        String html = "";
        for (Person person : persons) {
            html += person + "<br>";
        }
 
        return html;
    }
}