package com.informatica.ilm.pdmds.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.informatica.ilm.pdmds.model.api.User;
import com.informatica.ilm.pdmds.model.api.UserStatus;

@Entity
@Table(name = "ILM_USER")
public class UserImpl implements User {

	@Id
	@TableGenerator(name="UserIdGenerator",allocationSize = 200, initialValue = 1, table="ILM_SEQ_GEN", pkColumnName = "SEQ_NAME", pkColumnValue = "USER", valueColumnName = "SEQ_VALUE")
	@GeneratedValue(generator = "UserIdGenerator")
	@Column(name = "ID", precision = 19, scale = 0, nullable = false)
	private long id;
	
	@Version
	@Column(name = "VERSION", nullable = false)
	private int version;
	
	@Column(name = "NAME", nullable = false, length = 250)
	private String name;
	
	@Column(name = "DESCRIPTION", nullable = true, length = 4000)
	private String description;
	
	@Column(name = "DOMAIN_NAME", length = 250)
    private String domainname;

    @Column(name = "FULL_NAME", length = 765)
    private String fullname;

    @Column(name = "EMAIL", length = 765)
    private String email;

    @Column(name = "PHONE", length = 765)
    private String phone;
    
    @Column(name = "ADMIN")
    private boolean admin = false;

    @Column(name = "NAMESPACE", length = 250)
    private String namespace;

    @Column(name = "STATUS", length = 250)
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    
    @Transient
    private String password;
	
	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getVersion() {
		return version;
	}

	@Override
	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDomainname() {
		return domainname;
	}

	@Override
	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}

	@Override
	public String getFullname() {
		return fullname;
	}

	@Override
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean isAdmin() {
		return admin;
	}

	@Override
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String getNamespace() {
		return namespace;
	}

	@Override
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public UserStatus getStatus() {
		return status;
	}

	@Override
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

}
