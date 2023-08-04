package com.cc.CodingChallenge;

import com.cc.CodingChallenge.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Product, String>{

}
