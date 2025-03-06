package com.housingserver.my_housing_server.respository;

import com.housingserver.my_housing_server.model.HousingLoader;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingLoaderRepository extends MongoRepository<HousingLoader, String> {
}