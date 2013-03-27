package com.informatica.ilm.pdmds.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import com.informatica.ilm.pdmds.model.api.Privilege;

@Entity
public class PrivilegeImpl implements Privilege {

	@Id
	@TableGenerator(name = "PrivilegeIdGenerator", allocationSize = 200, initialValue = 1, table = "ILM_SEQ_GEN", pkColumnName = "SEQ_NAME", pkColumnValue = "ROLE", valueColumnName = "SEQ_VALUE")
	@GeneratedValue(generator = "PrivilegeIdGenerator")
	@Column(name = "ID", nullable = false, precision = 19, scale = 0)
	private long id;
	
	@Version
    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "NAME", nullable = false, length = 250)
    private java.lang.String name;

    @Column(name = "DESCRIPTION", length = 4000)
    private java.lang.String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

}
