package com.samisari.hotelmanagement.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.samisari.hotelmanagement.entity.auth.AppUser;

import java.lang.String;
import java.util.List;

@CrossOrigin
@RepositoryRestResource(path = "/app-user")
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
	@Query(value="SELECT u FROM AppUser u WHERE (u.email=?1 or u.phoneNumber=?2) and u.password=?3", nativeQuery=false )
	List<AppUser> findByEmailOrPhoneNumberAndPassword(String email, String phoneNumber, String password);
	@Query(value="SELECT u2 FROM AppUser u1, AppUser u2  WHERE u1.id=?1 AND u2 MEMBER OF u1.hotels", nativeQuery=false )
	List<AppUser> getHotelUsers(Long id);
	
}
