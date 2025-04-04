package com.example.featuresrequirements.Service;

import com.example.featuresrequirements.Entity.Retailer;
import com.example.featuresrequirements.Repository.RetailerRepository;
import jakarta.persistence.PersistenceContexts;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RetailerService {
    private RetailerRepository retailerRepository;
     public RetailerService(RetailerRepository retailerRepository) {
         this.retailerRepository = retailerRepository;

     }

}
