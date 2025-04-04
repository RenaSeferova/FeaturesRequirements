package com.example.featuresrequirements.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RetailerRepository extends JpaRepository<ProductRepository, Long> {
}
