package com.housingserver.my_housing_server.controller;

import com.housingserver.my_housing_server.model.HousingLoader;
import com.housingserver.my_housing_server.service.HousingLoaderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loaders")
public class HousingLoaderController {

    private final HousingLoaderService service;

    public HousingLoaderController(HousingLoaderService service) {
        this.service = service;
    }

    @GetMapping
    public List<HousingLoader> getAllLoaders() {
        return service.getAllLoaders();
    }
}
