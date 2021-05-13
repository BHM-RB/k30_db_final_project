package testmongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
 
    @Autowired
    private ProductRepository productRepository;
 
    @ResponseBody
    @RequestMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/showAllProduct'>Show All Products</a></li>";
        html += "</ul>";
        return html;
    }
    
    @ResponseBody
    @RequestMapping("/showAllProduct")
    public String showAllProduct() {
 
        List<Product> products = this.productRepository.findAll();
 
        String html = "";
        for (Product product : products) {
            html += product + "<br>";
        }
 
        return html;
    }
}