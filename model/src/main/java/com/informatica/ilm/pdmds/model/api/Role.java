package com.informatica.ilm.pdmds.model.api;

public interface Role extends ILMObject {

	public long getId();

	public void setId(long id);

	public Integer getVersion();

	public void setVersion(Integer version);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public RoleStatus getStatus();

	public void setStatus(RoleStatus status);
}
