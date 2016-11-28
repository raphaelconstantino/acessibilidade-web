package com.acessibilidade;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.acessibilidade.Ouch;
 
@RepositoryRestResource(collectionResourceRel = "ouch", path = "ouchs")
public interface OuchRepository extends PagingAndSortingRepository<Ouch, Long> {

	
}