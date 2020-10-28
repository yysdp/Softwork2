package main;

public class AverageMax implements AverageMax_Interface {

	@Override
	public float[] average(Student[] stu) {
		// TODO Auto-generated method stub
		float avg[]=new float[3]; 
		float summatch = 0,sumchinese = 0,sumenglish = 0;
		for(int i=0;i<stu.length;i++) {
			summatch +=stu[i].getMath_score();
			sumchinese +=stu[i].getChinese_score();
			sumenglish +=stu[i].getEnglish_score();
		}
		//System.out.println("总分"+summatch+" "+sumchinese+" "+sumenglish);
		avg[1] = summatch/stu.length;
		avg[0] = sumchinese/stu.length;
		avg[2] = sumenglish/stu.length;
		System.out.println("数学平均分："+avg[1]);
		System.out.println("语文平均分："+avg[0]);
		System.out.println("英语平均分："+avg[2]);
		return avg;
	}

	@Override
	public float[] max(Student[] stu) {
		// TODO Auto-generated method stub
		float max[]=new float[] {0,0,0,0}; 
		for(int i=0;i<stu.length;i++) {
			if(stu[i].getChinese_score()>max[0])
				max[0]=stu[i].getChinese_score();
			if(stu[i].getMath_score()>max[1])
				max[1]=stu[i].getMath_score();
			if(stu[i].getEnglish_score()>max[2])
				max[2]=stu[i].getEnglish_score();
			if(stu[i].getChinese_score()+stu[i].getMath_score()+stu[i].getEnglish_score()>max[3])
				max[3]=stu[i].getChinese_score()+stu[i].getMath_score()+stu[i].getEnglish_score();

		}
		System.out.println("最高语文："+max[0]);
		System.out.println("最高数学："+max[1]);
		System.out.println("最高英语："+max[2]);
		System.out.println("最高总分："+max[3]);
		return max;
	}


}
