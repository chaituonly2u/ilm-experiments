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

import com.informatica.ilm.pdmds.model.api.Port;
import com.informatica.ilm.pdmds.model.api.Source;

@Entity
public class PortImpl implements Port {
	
	@Id
	@TableGenerator(name = "PortIdGenerator", allocationSize = 200, initialValue = 1, table = "ILM_SEQ_GEN", pkColumnName = "SEQ_NAME", pkColumnValue = "PORT", valueColumnName = "SEQ_VALUE")
	@GeneratedValue(generator = "PortIdGenerator")
	@Column(name = "ID", precision = 19, scale = 0, nullable = false)
	private long id;

	@Version
	@Column(name = "VERSION", nullable = false)
	private int version;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH}, targetEntity = SourceImpl.class)
    @JoinColumn(name = "ID_SOURCE")
	private Source source;
	
	@Column(name = "NAME", nullable = false, length = 250)
	private String name;

    @Column(name = "DESCRIPTION", nullable = true, length = 4000)
    private String description;
    
    @Column(name = "PORT_DEF", nullable = true, length = 250)
    private String portDefaultValue;

    @Column(name = "DATA_TYPE", nullable = false, length = 250)
    private String dataType;

    @Column(name = "PRECISION", nullable = true, precision = 19, scale = 0)
    private Integer precision;

    @Column(name = "PORT_SIZE", nullable = false, precision = 19, scale = 0)
    private Integer columnSize;

    @Column(name = "DECIMAL_DIGITS", nullable = true, precision = 19, scale = 0)
    private Integer decimalDigits;

    @Column(name = "NULLABLE", nullable = false, length = 250)
    private String isNullable;

    @Column(name = "ORDINAL_POSITION", nullable = true, precision = 10, scale = 0)
    private Integer ordinalPosition;
    
    @Column(name = "IS_RESTRICTED", nullable = false)
    private boolean isRestricted = false;

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
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

	public String getPortDefaultValue() {
		return portDefaultValue;
	}

	public void setPortDefaultValue(String portDefaultValue) {
		this.portDefaultValue = portDefaultValue;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getColumnSize() {
		return columnSize;
	}

	public void setColumnSize(Integer columnSize) {
		this.columnSize = columnSize;
	}

	public Integer getDecimalDigits() {
		return decimalDigits;
	}

	public void setDecimalDigits(Integer decimalDigits) {
		this.decimalDigits = decimalDigits;
	}

	public String getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}

	public int getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(int ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public boolean isRestricted() {
		return isRestricted;
	}

	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}

}
