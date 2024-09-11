package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne  //many card item has one cart
    @JsonIgnore
    private Cart cart;

    @ManyToOne   //many cart item can ve same food
    private Food food;

    private int quantity;

    @ElementCollection  //????
    private List<String> ingredients;

    private Long totalPrice;


}
