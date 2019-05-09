package com.samisari.hotelmanagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.samisari.hotelmanagement.entity.Customer;
import com.samisari.hotelmanagement.entity.Hotel;
import com.samisari.hotelmanagement.entity.Reservation;
import com.samisari.hotelmanagement.entity.Room;
import com.samisari.hotelmanagement.entity.accounting.Transaction;
import com.samisari.hotelmanagement.entity.accounting.TransactionType;
import com.samisari.hotelmanagement.entity.auth.AppUser;
import com.samisari.hotelmanagement.entity.auth.Registration;

@Configuration
class CustomRestMvcConfiguration {

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {

		return new RepositoryRestConfigurer() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath("/api");
				config.exposeIdsFor(AppUser.class);
				config.exposeIdsFor(Hotel.class);
				config.exposeIdsFor(Room.class);
				config.exposeIdsFor(Registration.class);
				config.exposeIdsFor(TransactionType.class);
				config.exposeIdsFor(Reservation.class);
				config.exposeIdsFor(Customer.class);
				config.exposeIdsFor(Transaction.class);
				
//				config.getCorsRegistry().addMapping("/applicationUser/**")
//			      .allowedOrigins("http://localhost:4200/work", "http://localhost:4200/", "http://localhost:4200/home" )
//			      .allowedMethods("OPTIONS")
//			      .allowedHeaders("Access-Control-Allow-Origin")
//			      .exposedHeaders("Access-Control-Allow-Origin")
//			      .allowCredentials(false).maxAge(3600);
			}
		};
	}

}
