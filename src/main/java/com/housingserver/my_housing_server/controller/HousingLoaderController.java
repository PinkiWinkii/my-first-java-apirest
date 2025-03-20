package com.housingserver.my_housing_server.controller;

import com.housingserver.my_housing_server.model.HousingLoader;
import com.housingserver.my_housing_server.service.HousingLoaderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Ruta base para todos los endpoints
public class HousingLoaderController {

    private final HousingLoaderService service;

    public HousingLoaderController(HousingLoaderService service) {
        this.service = service;
    }

    // Endpoint GET para obtener todos los HousingLoader
    @GetMapping("/houses")
    public List<HousingLoader> getAllLoaders() {
        return service.getAllLoaders();
    }

    @PostMapping("/house") // Ruta específica para POST
    public String addHousing(@RequestBody HousingLoader housingLoader) {
        service.saveLoader(housingLoader);
        return "HousingLoader añadido correctamente";
    }
}