package com.informatica.ilm.pdmds.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import com.informatica.ilm.pdmds.model.api.UserGroup;
import com.informatica.ilm.pdmds.model.api.UserGroupStatus;

@Entity
public class UserGroupImpl implements UserGroup {
	
	@Id
	@TableGenerator(name="UserGroupIdGenerator",allocationSize = 200, initialValue = 1, table="ILM_SEQ_GEN", pkColumnName = "SEQ_NAME", pkColumnValue = "USERGROUP", valueColumnName = "SEQ_VALUE")
	@GeneratedValue(generator = "UserGroupIdGenerator")
	@Column(name = "ID", precision = 19, scale = 0, nullable = false)
	private long id;
	
	@Version
	@Column(name = "VERSION", nullable = false)
	private int version;
	
	@Column(name = "NAME", nullable = false, length = 250)
    private String name;

    @Column(name = "DESCRIPTION", length = 4000)
    private String description;

    @Column(name = "NAMESPACE", length = 250)
    private String namespace;

    @Column(name = "STATUS", length = 250)
    @Enumerated(EnumType.STRING)
    private UserGroupStatus status;

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

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public UserGroupStatus getStatus() {
		return status;
	}

	public void setStatus(UserGroupStatus status) {
		this.status = status;
	}

}
