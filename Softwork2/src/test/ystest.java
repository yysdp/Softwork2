package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.easymock.EasyMock;
import main.Find;
import main.Find_Interface;
import main.Main;
import main.Read;
import main.Read_Interface;
import main.Student;
import java.io.*;


class ystest {

	@Test
	void test() {
		Main main = new Main();
		String path="student.txt";
		Student[] stu = new Student[4];
		Read_Interface read = new Read();//模拟的
		//EasyMock.expect(read.read(path)).andReturn(stu);
		//EasyMock.replay(read);
		main.setRead(read);		
		stu = main.read(path);
	
		//assertArrayEquals(main.read(path),new Student[] {{"001","zhl",100.0,100.0,60.0},
			//	{"002","ys",88.0,99.0,77.0},{"003","lgy",86.0,168.0,100.0},{"004","cyc",96.0,60.0,60.0}});
	}

}
