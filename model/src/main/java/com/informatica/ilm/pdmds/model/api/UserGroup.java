package com.informatica.ilm.pdmds.model.api;

public interface UserGroup extends ILMObject {

	public long getId();

	public void setId(long id);

	public int getVersion();

	public void setVersion(int version);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public String getNamespace();

	public void setNamespace(String namespace);

	public UserGroupStatus getStatus();

	public void setStatus(UserGroupStatus status);
}
