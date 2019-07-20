package org.github.du00cs.graph;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@GraphQLApi
@Service
public class PlaceService {
    @Autowired
    PlaceRepository repo;

    @GraphQLMutation
    public Place createPlace(Place place) {
        return repo.save(place);
    }

    @GraphQLQuery
    public Collection<Place> allPlaces() {
        return repo.findAll();
    }
}
