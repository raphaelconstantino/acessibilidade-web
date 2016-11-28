package com.acessibilidade;

import java.util.List;


import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.PagingAndSortingRepository; 
import org.springframework.data.repository.query.Param; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.acessibilidade.UserRole;
 
@RepositoryRestResource(collectionResourceRel = "userRole", path = "userRoles")
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole, Long> {

	
}