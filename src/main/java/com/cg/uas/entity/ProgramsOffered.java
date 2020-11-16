package com.cg.uas.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;
@Entity
@Table(name="Programs_Offered")
public class ProgramsOffered 
{
	@Id
	@Column(name="ProgramName")
	String programName;
	@Column(name="description")
    String description;
	@Column(name="applicant_eligibility")
	String applicantEligibility;
	@Column(name="duration")
	int duration;
	@Column(name="degree_certificate_offered")
	String degreeCertificateOffered;
	public ProgramsOffered() {}
	public ProgramsOffered(String programName, String description, String applicantEligibility, int duration,String degreeCertificateOffered) {
		super();
		this.programName = programName;
		this.description = description;
		this.applicantEligibility = applicantEligibility;
		this.duration = duration;
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplicantEligibility() {
		return applicantEligibility;
	}
	public void setApplicantEligibility(String applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}
	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

}
