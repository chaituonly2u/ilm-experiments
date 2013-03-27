package com.informatica.ilm.pdmds.model.factory.api;

import com.informatica.ilm.pdmds.model.api.ILMObject;

public interface ModelFactory {

	<T extends ILMObject> T createObject(T clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	
}
