package com.samisari.hotelmanagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.samisari.hotelmanagement.entity.auth.Registration;

@CrossOrigin
@RepositoryRestResource(path = "/registration")
public interface RegistrationRepository extends CrudRepository<Registration, Long> {

}
