package com.maaz.JavaSpringBoot_Demo.repo;

import com.maaz.JavaSpringBoot_Demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved In DB");
    }
}
