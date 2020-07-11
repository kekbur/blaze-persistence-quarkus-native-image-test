package org.acme;

import java.util.UUID;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.UpdatableEntityView;

@UpdatableEntityView
@CreatableEntityView
@EntityView(Person.class)
public interface PersonUpdateView extends PersonView
{
	void setName(String name);
}
