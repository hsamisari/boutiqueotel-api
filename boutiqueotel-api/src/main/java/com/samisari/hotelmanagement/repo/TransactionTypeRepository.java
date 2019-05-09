package com.samisari.hotelmanagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.samisari.hotelmanagement.entity.accounting.TransactionType;
@CrossOrigin
@RepositoryRestResource(path = "/transaction-type")
public interface TransactionTypeRepository extends CrudRepository<TransactionType, Long>{

}
