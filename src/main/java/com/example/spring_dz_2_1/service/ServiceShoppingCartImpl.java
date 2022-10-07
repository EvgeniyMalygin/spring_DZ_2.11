package com.example.spring_dz_2_1.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ServiceShoppingCartImpl implements ServiceShoppingCart {

    public final List<Integer> shoppingCart;

    public ServiceShoppingCartImpl(List<Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        shoppingCart.addAll(items);
        return shoppingCart;
    }

    @Override
    public List<Integer> get() {
        return shoppingCart;
    }
}
