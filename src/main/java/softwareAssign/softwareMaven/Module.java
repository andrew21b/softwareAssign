package softwareAssign.softwareMaven;

import java.util.List;

public class Module {
	
	private String modName,modID;
	private List<Student> listStudent = null;
	
	public Module(String name, String id, List<Student> student) {
		this.modName = name;
		this.modID = id;
		this.listStudent = student;
	
	}
	
	public void setModName(String name) {
		this.modName = name;
	}
	
	public String getName() {
		return this.modName;
	}
	
	public void setModId(String id) {
		this.modID = id;
	}
	
	public String getModId() {
		return this.modID;
	}
	
	public void addStudent(Student student) {
		this.listStudent.add(student);
	}
	
	public List<Student> getStudentList(){
		return listStudent;
	}
	
}

