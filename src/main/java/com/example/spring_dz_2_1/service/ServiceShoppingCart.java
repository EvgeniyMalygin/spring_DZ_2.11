package com.example.spring_dz_2_1.service;

import java.util.List;

public interface ServiceShoppingCart {
    List<Integer> add(List<Integer> items);

    List<Integer> get();
}
