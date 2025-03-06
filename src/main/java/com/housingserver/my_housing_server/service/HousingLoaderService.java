package com.housingserver.my_housing_server.service;

import com.housingserver.my_housing_server.model.HousingLoader;
import com.housingserver.my_housing_server.respository.HousingLoaderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingLoaderService {

    private final HousingLoaderRepository repository;

    public HousingLoaderService(HousingLoaderRepository repository) {
        this.repository = repository;
    }

    public List<HousingLoader> getAllLoaders() {
        System.out.println("10 HousingLoaders buscados en MongoDB");
        return repository.findAll();
    }

    public void saveLoader(HousingLoader loader) {
        System.out.println("10 HousingLoaders insertados en MongoDB");
        repository.save(loader);
    }
}
