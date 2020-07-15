package org.acme;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.UpdatableEntityView;

@UpdatableEntityView
@CreatableEntityView
@EntityView(Person.class)
public interface PersonUpdateView extends PersonView
{
	void setName(String name);
}
