package main;
import java.io.*;

public class Read implements Read_Interface{

	@Override
	public Student[] read(String path) {
		// TODO Auto-generated method stub
		File file = new File(path);
		File file2 = new File(path);//定义两个File对象分别用于读取学生数目及写入数组
		Student sd[]=null;
		try
		{
			FileReader inone = new FileReader(file);
			BufferedReader intwo = new BufferedReader(inone);
			FileReader inthree = new FileReader(file2);
			BufferedReader infour = new BufferedReader(inthree);//定义两个缓冲流
			int k =0;
			while(intwo.readLine()!=null)
			{
				k++;
			}//读取学生数
			sd = new Student[k];//建立对象数组
			String s =null;
			int i,j;
			i=0;
			sd = new Student[k];
			for(int m = 0;m<k;m++)
			{
				sd[m] = new Student();
			}//实例化对象数组
			while((s=infour.readLine())!=null)
			{
				String[] temp=s.split(" ");
				sd[i].setNumber(temp[0]);
				sd[i].setName(temp[1]);
				sd[i].setChinese_score(Float.parseFloat(temp[2]));
				sd[i].setMath_score(Float.parseFloat(temp[3]));
				sd[i].setEnglish_score(Float.parseFloat(temp[4]));
				i++;
			}//写入对象数组
			inone.close();
			intwo.close();
			inthree.close();
			infour.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		return sd;
	}

}
