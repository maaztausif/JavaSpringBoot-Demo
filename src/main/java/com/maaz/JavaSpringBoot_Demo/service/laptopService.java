package com.maaz.JavaSpringBoot_Demo.service;

import com.maaz.JavaSpringBoot_Demo.model.Laptop;
import com.maaz.JavaSpringBoot_Demo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class laptopService {

    @Autowired
    private LaptopRepository lapRepo;
    public void addLaptop(Laptop lap){
        System.out.println("Add laptop called");

        lapRepo.save(lap);
    }
    public boolean isGoodForPrograming(Laptop lap){

        return true;
    }
}
