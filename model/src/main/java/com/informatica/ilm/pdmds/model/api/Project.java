package com.informatica.ilm.pdmds.model.api;

public interface Project extends ILMObject {

    long getId();

    void setId(long id);

    long getCreatedAt();

    void setCreatedAt(long createdAt);

    long getLastUpdatedAt();

    void setLastUpdatedAt(long updatedAt);

}
