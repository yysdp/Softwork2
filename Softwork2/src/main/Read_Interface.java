package main;
/* 读取文件得到学生类，
 * 于嵩，
 * 继承此接口，实现read方法
 * */
public interface Read_Interface {
	//返回学生实体类
	public abstract Student[] read(String path);

}
