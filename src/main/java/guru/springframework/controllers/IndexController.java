package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){
    	System.out.println("ANOTHER TEST");
        model.addAttribute("products", productService.listProducts());

        return "index";
    }

}
