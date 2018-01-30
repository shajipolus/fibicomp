package com.polus.fibicomp.committee.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "FIBI_COMMITTEE")
public class Committee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COMMITTEE_ID")
	private String committeeId;

	@Column(name = "COMMITTEE_NAME")
	private String committeeName;

	@Column(name = "HOME_UNIT_NUMBER")
	private String homeUnitNumber;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "SCHEDULE_DESCRIPTION")
	private String scheduleDescription;

	@Column(name = "COMMITTEE_TYPE_CODE")
	private Integer committeeTypeCode;

	@ManyToOne(optional = false)
	@JoinColumn(foreignKey = @ForeignKey(name = "FK_FIBI_COMMITTEE"), name = "COMMITTEE_TYPE_CODE", referencedColumnName = "COMMITTEE_TYPE_CODE", insertable = false, updatable = false)
	private CommitteeType committeeType;

	@Column(name = "MINIMUM_MEMBERS_REQUIRED")
	private Integer minimumMembersRequired;

	@Column(name = "MAX_PROTOCOLS")
	private Integer maxProtocols;

	@Column(name = "ADV_SUBMISSION_DAYS_REQ")
	private Integer advSubmissionDaysReq;

	@Column(name = "DEFAULT_REVIEW_TYPE_CODE")
	private Integer defaultReviewTypecode;

	@Column(name = "APPLICABLE_REVIEW_TYPE_CODE")
	private Integer applicableReviewTypecode;

	@Column(name = "CREATE_TIMESTAMP")
	private Timestamp createTimestamp;

	@Column(name = "CREATE_USER")
	private String createUser;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Version
	@Column(name = "VER_NBR", length = 8)
	private Integer verNbr;

	@Column(name = "OBJ_ID", length = 36, unique = true)
	private String objId;

	@OneToMany(mappedBy = "committee", orphanRemoval = true, cascade = { CascadeType.ALL })
	private List<CommitteeResearchAreas> researchAreas;

	public String getCommitteeId() {
		return committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public String getCommitteeName() {
		return committeeName;
	}

	public void setCommitteeName(String committeeName) {
		this.committeeName = committeeName;
	}

	public String getHomeUnitNumber() {
		return homeUnitNumber;
	}

	public void setHomeUnitNumber(String homeUnitNumber) {
		this.homeUnitNumber = homeUnitNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScheduleDescription() {
		return scheduleDescription;
	}

	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}

	public CommitteeType getCommitteeType() {
		return committeeType;
	}

	public void setCommitteeType(CommitteeType committeeType) {
		this.committeeType = committeeType;
	}

	public Integer getMinimumMembersRequired() {
		return minimumMembersRequired;
	}

	public void setMinimumMembersRequired(Integer minimumMembersRequired) {
		this.minimumMembersRequired = minimumMembersRequired;
	}

	public Integer getMaxProtocols() {
		return maxProtocols;
	}

	public void setMaxProtocols(Integer maxProtocols) {
		this.maxProtocols = maxProtocols;
	}

	public Integer getAdvSubmissionDaysReq() {
		return advSubmissionDaysReq;
	}

	public void setAdvSubmissionDaysReq(Integer advSubmissionDaysReq) {
		this.advSubmissionDaysReq = advSubmissionDaysReq;
	}

	public Integer getDefaultReviewTypecode() {
		return defaultReviewTypecode;
	}

	public void setDefaultReviewTypecode(Integer defaultReviewTypecode) {
		this.defaultReviewTypecode = defaultReviewTypecode;
	}

	public Integer getApplicableReviewTypecode() {
		return applicableReviewTypecode;
	}

	public void setApplicableReviewTypecode(Integer applicableReviewTypecode) {
		this.applicableReviewTypecode = applicableReviewTypecode;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
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

	public Integer getVerNbr() {
		return verNbr;
	}

	public void setVerNbr(Integer verNbr) {
		this.verNbr = verNbr;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public Integer getCommitteeTypeCode() {
		return committeeTypeCode;
	}

	public void setCommitteeTypeCode(Integer committeeTypeCode) {
		this.committeeTypeCode = committeeTypeCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<CommitteeResearchAreas> getResearchAreas() {
		return researchAreas;
	}

	public void setResearchAreas(List<CommitteeResearchAreas> researchAreas) {
		this.researchAreas = researchAreas;
	}
}
