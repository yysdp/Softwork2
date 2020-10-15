package main;
/* 求平均值和最大值，
 * 程业超，
 * 继承此接口，实现average和max方法，
 * */
public interface AverageMax_Interface {
	//根据学生实体类输出各科平均值、最大值，
	public abstract float[] average(Student[] stu);
	public abstract float[] max(Student[] stu);

}
