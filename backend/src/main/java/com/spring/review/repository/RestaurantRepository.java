package com.spring.review.repository;

import com.spring.review.domain.entity.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {
    // TODO : custom queries


}
