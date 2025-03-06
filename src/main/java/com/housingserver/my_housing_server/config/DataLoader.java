package com.housingserver.my_housing_server.config;

import com.housingserver.my_housing_server.model.HousingLoader;
import com.housingserver.my_housing_server.respository.HousingLoaderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(HousingLoaderRepository repository) {
        return args -> {
            try {
                if (repository != null && repository.count() == 0) { // Verificar que el repositorio no es null y está vacío
                    List<HousingLoader> loaders = List.of(
                            new HousingLoader("Casa Azul", "Madrid", "España", "bernard-hermant-CLKGGwIBTaY-unsplash.jpg", 5, true, true),
                            new HousingLoader("Residencia Verde", "Barcelona", "España", "brandon-griggs-wR11KBaB86U-unsplash.jpg", 3, false, true),
                            new HousingLoader("Villa Roja", "Sevilla", "España", "i-do-nothing-but-love-lAyXdl1-Wmc-unsplash.jpg", 2, true, false),
                            new HousingLoader("Piso Céntrico", "Valencia", "España", "ian-macdonald-W8z6aiwfi1E-unsplash.jpg", 4, true, true),
                            new HousingLoader("Chalet Moderno", "Bilbao", "España", "krzysztof-hepner-978RAXoXnH4-unsplash.jpg", 6, false, false),
                            new HousingLoader("Apartamento Loft", "Málaga", "España", "r-architecture-JvQ0Q5IkeMM-unsplash.jpg", 3, true, true),
                            new HousingLoader("Casa Rural", "Granada", "España", "phil-hearing-IYfp2Ixe9nM-unsplash.jpg", 2, false, true),
                            new HousingLoader("Dúplex con Terraza", "Alicante", "España", "r-architecture-GGupkreKwxA-unsplash.jpg", 5, true, true),
                            new HousingLoader("Estudio Minimalista", "Zaragoza", "España", "saru-robert-9rP3mxf8qWI-unsplash.jpg", 1, true, false),
                            new HousingLoader("Ático Panorámico", "San Sebastián", "España", "webaliser-_TPTXZd9mOo-unsplash.jpg", 2, true, true)
                    );

                    repository.saveAll(loaders);
                    System.out.println("✅ Se insertaron 10 HousingLoaders en MongoDB");

                    // Verificar los datos insertados
                    repository.findAll().forEach(System.out::println);
                } else {
                    System.out.println("ℹ️ La base de datos ya tiene datos. No se insertaron nuevos registros.");
                }
            } catch (Exception e) {
                System.err.println("❌ Error al insertar HousingLoaders en MongoDB: " + e.getMessage());
                e.printStackTrace();
            }
        };
    }
}
