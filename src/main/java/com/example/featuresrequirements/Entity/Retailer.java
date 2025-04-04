package com.example.featuresrequirements.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Primary;

@Entity
public class Retailer {
    @Id
    private int id;
    private String name;
    private Double price;
    private String retailerName;
    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Retailer retailer;
}


