package akhila.ch22;

public class Student1 
{
	String Name;
	char section;
	@Override
	public String toString() {
		return "Student1 [Name=" + Name + ", section=" + section + ", marks=" + marks + ", collage=" + collage + "]";
	}
	int marks;
	String collage;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
}
