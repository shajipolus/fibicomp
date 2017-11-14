
package com.polus.fibicomp.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.polus.fibicomp.util.JpaCharBooleanConversion;

@Entity
@Table(name = "UNIT_ADMINISTRATOR_TYPE")
public class UnitAdministratorType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String ADMINISTRATIVE_OFFICER_TYPE_CODE = "1";

	public static final String OSP_ADMINISTRATOR_TYPE_CODE = "2";

	public static final String UNIT_HEAD_TYPE_CODE = "3";

	public static final String DEAN_VP_TYPE_CODE = "4";

	public static final String OTHER_INDIVIDUAL_TO_NOTIFY_TYPE_CODE = "5";

	public static final String GRANTS_GOV_PROPOSAL_CONTACT_TYPE_CODE = "6";

	public static final String ADMINISTRATIVE_CONTACT_TYPE_CODE = "7";

	public static final String FINANCIAL_CONTACT_TYPE_CODE = "8";

	@Id
	@Column(name = "UNIT_ADMINISTRATOR_TYPE_CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "MULTIPLES_FLAG")
	@Convert(converter = JpaCharBooleanConversion.class)
	private boolean multiplesFlag;

	@Column(name = "DEFAULT_GROUP_FLAG")
	private String defaultGroupFlag;

	@Column(name = "OBJ_ID", length = 36, unique = true)
	protected String objectId;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Version
	@Column(name = "VER_NBR", length = 8)
	protected Long versionNumber;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMultiplesFlag() {
		return multiplesFlag;
	}

	public void setMultiplesFlag(boolean multiplesFlag) {
		this.multiplesFlag = multiplesFlag;
	}

	public String getDefaultGroupFlag() {
		return defaultGroupFlag;
	}

	public void setDefaultGroupFlag(String defaultGroupFlag) {
		this.defaultGroupFlag = defaultGroupFlag;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Long getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Long versionNumber) {
		this.versionNumber = versionNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}