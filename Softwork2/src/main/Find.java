package main;

public class Find implements Find_Interface{

	@Override
	public float[] findnumber(String num, Student[] stu) {
		
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getNumber().equals(num) ){
				grade[0] = stu[i].getChinese_score();
				grade[1] = stu[i].getMath_score();				
				grade[2] = stu[i].getEnglish_score();
				System.out.println("查找成功："+grade[0]+" "+grade[1]+" "+grade[2]);
			}
		}
		

		return grade;
	}

	@Override
	public float[] findname(String name, Student[] stu) {
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getName().equals(name) ){
				grade[1] = stu[i].getMath_score();
				grade[0] = stu[i].getChinese_score();
				grade[2] = stu[i].getEnglish_score();
				System.out.println("查找成功："+grade[0]+" "+grade[1]+" "+grade[2]);
			}
		}

		return grade;
	}




}
