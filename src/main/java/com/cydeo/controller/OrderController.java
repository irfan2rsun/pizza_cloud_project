package com.cydeo.controller;

import com.cydeo.model.Pizza;
import com.cydeo.model.PizzaOrder;
import com.cydeo.repository.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final PizzaRepository pizzaRepository;

    public OrderController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping("/current")
    public String orderForm(UUID pizzaId, Model model) {

        PizzaOrder pizzaOrder = new PizzaOrder();

        // TODO fix the getPizza() method below in line 46.
        pizzaOrder.setPizza(getPizza(pizzaId));

        model.addAttribute("pizzaOrder", pizzaOrder);

        return "/orderForm";
    }

    @PostMapping("/{pizzaId}")
    public String processOrder(UUID pizzaId, @ModelAttribute PizzaOrder pizzaOrder) {

        // Saving the order
        pizzaOrder.setPizza(getPizza(pizzaId));
        System.out.println("Order is successfully saved");

        return "redirect:/home";
    }

    //TODO complete method
    private Pizza getPizza(UUID pizzaId) {
        // Get the pizza from repository based on it's id
        return new Pizza();
    }

}
