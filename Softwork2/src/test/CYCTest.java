package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.easymock.EasyMock;
import org.junit.Test;

import main.AverageMax;
import main.AverageMax_Interface;
import main.Find;
import main.Find_Interface;
import main.Main;
import main.Read_Interface;
import main.Student;

public class CYCTest {

	@Test
	public void test() {
		Main main = new Main();
		String path="sutdent.txt";
	 	Student[] stu = new Student[4];
	
	 	stu[0] = new Student("001", "zhl", 100, 100, 60);
		stu[1] = new Student("002", "ys", 88, 99, 77);
		stu[2] = new Student("003", "lgy", 86, 68, 100);
		stu[3] = new Student("004", "cyc", 96, 69, 60);
		
		Read_Interface read = EasyMock.createMock(Read_Interface.class);
		EasyMock.expect(read.read(path)).andReturn(stu);
		EasyMock.replay(read);
		main.setRead(read);		
		stu = main.read(path);
		
		 
		AverageMax_Interface ave = EasyMock.createMock(AverageMax_Interface.class);
		AverageMax_Interface ave_real = new AverageMax();
		main.setAverageMax(ave_real);
		assertArrayEquals(main.average(),new float[]{59, (float) 62.5, 60});
		assertArrayEquals(main.max(),new float[]{90, 100, 110,258});
		
	}

}
