package software;


import java.time.LocalTime;
import java.util.*;
public class Student  {
	public String studentEmailId;
	public String questions;
	public Date blockDate;
	public Date time; 
	public String status;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getBlockDate() {
		return blockDate;
	}
	public void setBlockDate(Date blockDate) {
		this.blockDate = blockDate;
	}
	public String getStudentEmailId() {
		return studentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	public Student(String studentEmailId,String questions,Date time, Date blockDate, String status) {
        this.studentEmailId = studentEmailId;
        this.questions = questions;
        this.time = time;
        this.blockDate = blockDate;
        this.status =status;
    }
}






