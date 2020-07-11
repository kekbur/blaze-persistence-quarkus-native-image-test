package org.acme;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;

import java.util.UUID;

@EntityView(Person.class)
public interface PersonView
{
	@IdMapping
	UUID getId();
	
	String getName();
}
