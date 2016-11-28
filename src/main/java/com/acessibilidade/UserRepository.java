package com.acessibilidade;

import java.util.List;


import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.PagingAndSortingRepository; 
import org.springframework.data.repository.query.Param; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.acessibilidade.User;
 
@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	List<User> findByUsername(@Param("username") String username);
}