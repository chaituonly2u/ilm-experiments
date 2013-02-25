package com.informatica.ilm.pdmds.model.api;

public interface Datasource extends ILMObject {
	
	public long getId();

	public void setId(long id);

	public int getVersion();

	public void setVersion(int version);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public User getCreatedBy();

	public void setCreatedBy(User createdBy);

	public long getCreatedAt();

	public void setCreatedAt(long createdAt);

	public User getUpdatedBy();

	public void setUpdatedBy(User updatedBy);

	public long getUpdatedAt();

	public void setUpdatedAt(long updatedAt);
}
