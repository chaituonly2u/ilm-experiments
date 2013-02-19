package com.informatica.ilm.pdmds.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import com.informatica.ilm.pdmds.model.api.UserGroup;

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
    private String status;

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub

	}

}
