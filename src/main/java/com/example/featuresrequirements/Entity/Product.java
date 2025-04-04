package com.example.featuresrequirements.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Entity
@Validated
@NotBlank
@Primary
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String email;

//    @ManyToOne (cascade = CascadeType.ALL);
////    @JoinColumn(name = "retailer_id")
//    private List<Retailer> retailer;
//
//    public Retailer getRetailer() {
//        return retailer;
//    }
//
//    public void setRetailer(Retailer retailer) {
//        this.retailer = retailer;
//    }
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Retailer> retailers = new ArrayList<>();
}



