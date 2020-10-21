package main;

public class AverageMax implements AverageMax_Interface {

	@Override
	public float[] average(Student[] stu) {
		// TODO Auto-generated method stub
		float avg[]=new float[3]; 
		float summatch = 0,sumchinese = 0,sumenglish = 0;
		for(int i=1;i<stu.length;i++) {
			summatch +=stu[i].getMath_score();
		}
		for(int i=1;i<stu.length;i++) {
			sumchinese +=stu[i].getChinese_score();
		}
		for(int i=1;i<stu.length;i++) {
			sumenglish +=stu[i].getEnglish_score();
		}
		avg[0] = summatch/stu.length;
		avg[1] = sumchinese/stu.length;
		avg[2] = sumenglish/stu.length;
		System.out.println(avg[0]);
		System.out.println(avg[1]);
		System.out.println(avg[2]);
		
		return avg;
	}

	@Override
	public float[] max(Student[] stu) {
		// TODO Auto-generated method stub
		float max[]=new float[] {0,0,0,0}; 
		int j = 0;
		for(int i=0;i<stu.length;i++) {
			if(stu[i].getChinese_score()>max[0])
				max[0]=stu[i].getChinese_score();
			if(stu[i].getMath_score()>max[1])
				max[1]=stu[i].getMath_score();
			if(stu[i].getEnglish_score()>max[1])
				max[2]=stu[i].getEnglish_score();
			if(stu[i].getChinese_score()+stu[i].getMath_score()+stu[i].getEnglish_score()>max[3])
				max[3]=stu[i].getChinese_score()+stu[i].getMath_score()+stu[i].getEnglish_score();
//			float max1 = stu[i].getMath_score();
//			if(max1<stu[i].getChinese_score()) {
//				max1 = stu[i].getChinese_score();
//			}else if(max1 <stu[i].getEnglish_score()) {
//				max1 = stu[i].getEnglish_score();
//			}
//			max[j] = max1;
		}
		System.out.println();
		System.out.println(max[0]);
		System.out.println(max[1]);
		System.out.println(max[2]);
		System.out.println(max[3]);
		return max;
	}


}
