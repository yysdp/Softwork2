package test;

import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;

import main.AverageMax;
import main.Find;
import main.Main;
import main.Main_Interface;
import main.Read;
import main.Sort;
import main.Student;

class Test {

	/*
	 * 从文本读取数据 每一行 学号 姓名 数学成绩 语文成绩 英语成绩 于嵩 
	 * 统计每一科平均分，最高分，程业超 
	 * 按照总成绩排序 张海亮 
	 * 按学号或姓名查找成绩 李光远
	 */
	
	@org.junit.jupiter.api.Test
	void test() {
		String path="sutdent.txt";
		Student[] stu = new Student[4];
		stu[0] = new Student("001", "zhl", 100, 100, 60);
		stu[1] = new Student("002", "ys", 88, 99, 77);
		stu[2] = new Student("003", "lgy", 86, 168, 100);
		stu[3] = new Student("004", "cyc", 96, 69, 60);
		Read read = EasyMock.createMock(Read.class);//模拟的
		EasyMock.expect(read.read(path)).andReturn(stu);
		EasyMock.replay(read);
		stu = read.read(path);
				
		AverageMax averageMax = EasyMock.createMock(AverageMax.class);//模拟的
		float[] max= {100,100,100};
		float[] average= {60,70,80};
		EasyMock.expect(averageMax.average(stu)).andReturn(average);
		EasyMock.expect(averageMax.max(stu)).andReturn(max);
		EasyMock.replay(averageMax);
		
		assertArrayEquals(max,averageMax.max(stu));
		assertArrayEquals(average,averageMax.average(stu));
	
		
		float[] so = {66,77,88,99};
		Sort sort = EasyMock.createMock(Sort.class);//模拟的
		EasyMock.expect(sort.sort(stu)).andReturn(so);
		EasyMock.replay(sort);
		assertArrayEquals(so,sort.sort(stu));

		
		Find find = EasyMock.createMock(Find.class);//模拟的
		EasyMock.expect(find.findnumber("002", stu)).andReturn(1);
		EasyMock.expect(find.findname("zhl", stu)).andReturn(2);
		EasyMock.replay(find);
		assertEquals(find.findname("zhl", stu),2);
		assertEquals(find.findnumber("002", stu),1);
	
	}
	@org.junit.jupiter.api.Test
	void test2() {
		Main_Interface main = new Main();
		String path="sutdent.txt";
		
		Student[] stu = new Student[4];
		stu[0] = new Student("001", "zhl", 100, 100, 60);
		stu[1] = new Student("002", "ys", 88, 99, 77);
		stu[2] = new Student("003", "lgy", 86, 168, 100);
		stu[3] = new Student("004", "cyc", 96, 69, 60);
		
	
	}
}
