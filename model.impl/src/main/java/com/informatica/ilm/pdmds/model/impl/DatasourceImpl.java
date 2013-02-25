package com.informatica.ilm.pdmds.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import com.informatica.ilm.pdmds.model.api.Datasource;
import com.informatica.ilm.pdmds.model.api.User;

@Entity
public class DatasourceImpl implements Datasource {

	@Id
	@TableGenerator(name = "DatasourceIdGenerator", allocationSize = 200, initialValue = 1, table = "ILM_SEQ_GEN", pkColumnName = "SEQ_NAME", pkColumnValue = "DATASOURCE", valueColumnName = "SEQ_VALUE")
	@GeneratedValue(generator = "DatasourceIdGenerator")
	@Column(name = "ID", precision = 19, scale = 0, nullable = false)
	private long id;

	@Version
	@Column(name = "VERSION", nullable = false)
	private int version;

	@Column(name = "NAME", nullable = false, length = 250)
	private String name;

	@Column(name = "DESCRIPTION", length = 4000)
	private String description;

	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = { CascadeType.REFRESH }, targetEntity = UserImpl.class)
	@JoinColumn(name = "ID_CREATED_BY")
	private User createdBy;

	@Column(name = "CREATION_TIME", precision = 19, scale = 0, nullable = false)
	private long createdAt;

	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = { CascadeType.REFRESH }, targetEntity = UserImpl.class)
	@JoinColumn(name = "ID_UPDATED_BY")
	private User updatedBy;

	@Column(name = "UPDATION_TIME", precision = 19, scale = 0, nullable = false)
	private long updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public User getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

}
