package com.acessibilidade;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.acessibilidade.Usuario;
 
@RepositoryRestResource(collectionResourceRel = "ouch", path = "ouchs")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

	
}