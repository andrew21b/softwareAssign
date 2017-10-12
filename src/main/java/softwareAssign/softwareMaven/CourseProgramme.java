package softwareAssign.softwareMaven;

import java.sql.Time;
import java.time.*;
import java.util.List;

public class CourseProgramme {

	private String courseName;
	private List<Module> modules = null;
	private LocalDate startDate, endDate;
	
	public CourseProgramme(String courseName, List<Module> mods, LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.modules = mods;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void setCourseName(String newCourseName){
		this.courseName = newCourseName;
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	
	public LocalDate getStartDate(){
		return this.startDate;
	}
	
	public void setStartDate(LocalDate newStart){
		this.startDate = newStart;
	}
	
	public void setEndDate(LocalDate newEnd){
		this.endDate = newEnd;
	}
	
	public List<Module> getModList(){
		return this.modules;
	}
}

