package org.github.du00cs.graph;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlaceRepository extends MongoRepository<Place, String> {
    List<Place> findByAlias(String alias);
}