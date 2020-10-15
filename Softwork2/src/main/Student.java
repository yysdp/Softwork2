package main;

/*实体类，学生*/
public class Student {
	private String number;
	private String name;
	private float chinese_score;
	private float math_score;
	private float English_score;
	public Student(String number,String name,float a,float b ,float c) {
		this.number = number;
		this.name = name;
		this.chinese_score = a;
		this.math_score = b;
		this.English_score = c;
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getChinese_score() {
		return chinese_score;
	}
	public void setChinese_score(float chinese_score) {
		this.chinese_score = chinese_score;
	}
	public float getMath_score() {
		return math_score;
	}
	public void setMath_score(float math_score) {
		this.math_score = math_score;
	}
	public float getEnglish_score() {
		return English_score;
	}
	public void setEnglish_score(float english_score) {
		English_score = english_score;
	}

}
