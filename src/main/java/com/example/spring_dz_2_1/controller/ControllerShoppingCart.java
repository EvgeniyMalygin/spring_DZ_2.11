package com.example.spring_dz_2_1.controller;

import com.example.spring_dz_2_1.service.ServiceShoppingCartImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerShoppingCart {

    private final ServiceShoppingCartImpl serviceShoppingCart;

    public ControllerShoppingCart(ServiceShoppingCartImpl serviceShoppingCart) {
        this.serviceShoppingCart = serviceShoppingCart;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam ("items") List<Integer> items) {
        return serviceShoppingCart.add(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return serviceShoppingCart.get();
    }

}
