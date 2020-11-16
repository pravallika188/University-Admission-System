package com.cg.uas.entity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;
@Entity
@Table(name="Programs_Scheduled")
public class ProgramsScheduled 
{
	@Id
	@Column(name="Scheduled_program_id")
	String scheduledProgramId;
	@Column(name="ProgramName")
	String programName;
	@Column(name="Location")
	String location;
	@Column(name="start_date")
	LocalDate startDate;
	@Column(name="end_date")
	LocalDate endDate;
	@Column(name="sessions_per_week")
	int sessionsPerWeek;
	public ProgramsScheduled()
	{}
	public ProgramsScheduled(String scheduledProgramId, String programName, String location, LocalDate startDate,LocalDate endDate, int sessionsPerWeek) {
		super();
		this.scheduledProgramId = scheduledProgramId;
		this.programName = programName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessionsPerWeek = sessionsPerWeek;
	}
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getSessionsPerWeek() {
		return sessionsPerWeek;
	}
	public void setSessionsPerWeek(int sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}
	

}
