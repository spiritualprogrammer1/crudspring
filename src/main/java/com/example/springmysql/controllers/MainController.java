package com.example.springmysql.controllers;

import com.example.springmysql.Entite.Product;
import com.example.springmysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
   @Autowired
    private ProductService productService;

     @RequestMapping(value = "/")
    public String viewHomePage(Model model) {
         List<Product> productLists =  productService.listAll();
         model.addAttribute("listProducts",productLists) ;
         return "index";
     }

     @RequestMapping(value = "/new")
    public String showNewProductForm(Model model)
     {
         Product product = new Product();
         model.addAttribute("product",product) ;
         return "new_prodcut";
     }

     @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("Product") Product product)
     {
         productService.save(product);

         return "redirect:/";
     }


    @RequestMapping(value = "/edit/{id}")
    public ModelAndView showEditProductForm(@PathVariable(name="id") Long id)
    {
        /*******on creer un modelet view*********/
        ModelAndView mv = new ModelAndView("edit_product");

        Product product = productService.get(id);
        mv.addObject("product",product);

        return mv;
    }

    @RequestMapping(value = "delete/{id}")
    public String deleteProduct(@PathVariable(name="id") Long id)
    {
        productService.delete(id);
        return "redirect:/";
    }


}
