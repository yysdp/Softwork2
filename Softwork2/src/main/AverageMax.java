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

		return max;
	}


}
