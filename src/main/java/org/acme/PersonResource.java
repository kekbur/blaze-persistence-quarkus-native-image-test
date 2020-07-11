package org.acme;

import java.util.Random;
import java.util.UUID;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blazebit.persistence.view.EntityViewManager;

@Path("persons")
public class PersonResource
{
	@Inject
	EntityManager em;
	
	@Inject
	EntityViewManager evm;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public PersonView createPerson()
	{
		Person person = new Person("P" + new Random().nextInt(), new Random().nextLong());
		person.setId(UUID.randomUUID());
		em.persist(person);
		return evm.find(em, PersonView.class, person.getId());
	}
}
