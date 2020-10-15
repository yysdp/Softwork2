package test;

import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;

import main.AverageMax;
import main.AverageMax_Interface;
import main.Find;
import main.Find_Interface;
import main.Main;
import main.Main_Interface;
import main.Read;
import main.Read_Interface;
import main.Sort;
import main.Sort_Interface;
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
		Main main = new Main();
		String path="sutdent.txt";
		Student[] stu = new Student[4];
		stu[0] = new Student("001", "zhl", 100, 100, 60);
		stu[1] = new Student("002", "ys", 88, 99, 77);
		stu[2] = new Student("003", "lgy", 86, 68, 100);
		stu[3] = new Student("004", "cyc", 96, 69, 60);
		
		Read_Interface read = EasyMock.createMock(Read_Interface.class);//模拟的
		EasyMock.expect(read.read(path)).andReturn(stu);
		EasyMock.replay(read);
		main.setRead(read);		
		stu = main.read(path);
	    
	    Find_Interface find = EasyMock.createMock(Find_Interface.class);//模拟的
		EasyMock.expect(find.findnumber("002", stu)).andReturn(1);
		EasyMock.expect(find.findname("zhl", stu)).andReturn(2);
		EasyMock.replay(find);
		main.setFind(find);
		assertEquals(main.findnumber("002"),1);
		assertEquals(main.findname("zhl"),2);
		
		float[] so = new float[]{225,254,260,264};
		//Sort_Interface sort = EasyMock.createMock(Sort_Interface.class);//模拟的
		Sort_Interface sort_real = new Sort();
		//sort_real.sort(stu);
		//EasyMock.expect(sort.sort(stu)).andReturn(so);
		//EasyMock.replay(sort);
		main.setSort(sort_real);
		assertArrayEquals(so,main.sort());
		
		AverageMax_Interface averageMax = EasyMock.createMock(AverageMax_Interface.class);//模拟的
		float[] max= {100,100,100};
		float[] average= {60,70,80};
		EasyMock.expect(averageMax.average(stu)).andReturn(average);
		EasyMock.expect(averageMax.max(stu)).andReturn(max);
		EasyMock.replay(averageMax);
		main.setAverageMax(averageMax);
		assertArrayEquals(max,main.max());
		assertArrayEquals(average,main.average());
		
		
	
		
	
	}
}
