package com.informatica.ilm.pdmds.model.factory.impl;

import com.informatica.ilm.pdmds.model.api.ILMObject;
import com.informatica.ilm.pdmds.model.factory.api.ModelFactory;

public class ModelFactoryImpl implements ModelFactory {

    @Override
    public <T extends ILMObject> T createObject(T clazz) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        Object o = (Class.forName(clazz.getClass().getName()).newInstance());
        return (T) o;
    }
}
