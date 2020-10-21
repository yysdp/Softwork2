package main;

/*主类 
 * 从文本读取数据 每一行 学号 姓名 数学成绩 语文成绩 英语成绩 于嵩 
 *  统计每一科平均分，最高分，程业超 
 *  按照总成绩排序 张海亮 
 *  按学号或姓名查找成绩 李光远
 * 集成测试*/
public class Main implements Main_Interface{
	private AverageMax_Interface averageMax;
	private Find_Interface find;
	private Read_Interface read;
	private Sort_Interface sort;
	private Student[] stu;
	String path;
	String name;
	String num;
	
	
	public Student[] getStu() {
		return stu;
	}
	public String getPath() {
		return path;
	}
	public String getName() {
		return name;
	}
	public String getNum() {
		return num;
	}
	public void setStu(Student[] stu) {
		this.stu = stu;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Find_Interface getFind() {
		return find;
	}
	public Read_Interface getRead() {
		return read;
	}
	public Sort_Interface getSort() {
		return sort;
	}
	
	public AverageMax_Interface getAverageMax() {
		return averageMax;
	}
	public void setAverageMax(AverageMax_Interface averageMax) {
		this.averageMax = averageMax;
	}
	public void setFind(Find_Interface find) {
		this.find = find;
	}
	public void setRead(Read_Interface read) {
		this.read = read;
	}
	public void setSort(Sort_Interface sort) {
		this.sort = sort;
	}
	@Override
	public float[] sort() {
		// TODO Auto-generated method stub
		return sort.sort(stu);
	}
	@Override
	public Student[] read(String path) {
		// TODO Auto-generated method stub
		this.stu = read.read(path);
		return stu;
	}
	@Override
	public float[] findnumber(String num) {
		// TODO Auto-generated method stub
		return find.findnumber(num, stu);
	}
	@Override
	public float[] findname(String name) {
		// TODO Auto-generated method stub
		return find.findname(name, stu);
	}
	@Override
	public float[] average() {
		// TODO Auto-generated method stub
		return averageMax.average(stu);
	}
	@Override
	public float[] max() {
		// TODO Auto-generated method stub
		return averageMax.max(this.stu);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.setFind(new Find());
		main.setAverageMax(new AverageMax());
		main.setSort(new Sort());
		main.setRead(new Read());
		main.setPath("student.txt");
		main.setName("zhl");
		main.setNum("002");
		main.execute();
	

	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub	
		read(path);
		sort();
		average();
		max();
		findname(name);
		findnumber(num);		
	}
}
