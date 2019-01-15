package com.lamc.mongodbrestapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lamc.mongodbrestapi.model.Pessoa;

@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa")
public interface PessoaRepository extends MongoRepository<Pessoa, String> {
	List<Pessoa> findByNome(@Param("nome") String nome);
}
