package main;

public class Sort implements Sort_Interface {

	@Override
	public float[] sort(Student[] stu) {
		// TODO Auto-generated method stub
		float[][] arr= new float[stu.length][2];
		float[] ar = new float[stu.length];
		float t;
		int i,j;
		for(i=0;i<stu.length;i++) {
			arr[i][0]=i;
			arr[i][1]+=stu[i].getChinese_score();
			arr[i][1]+=stu[i].getMath_score();
			arr[i][1]+=stu[i].getEnglish_score();
		}
		for(i=0;i<stu.length;i++) {
			for(j=i+1;j<stu.length;j++) {
				if(arr[i][1]>arr[j][1]) {
					t=arr[i][1];
					arr[i][1]=arr[j][1];
					arr[j][1]=t;
					t=arr[i][0];
					arr[i][0]=arr[j][0];
					arr[j][0]=t;				
				}
			}
		}
		System.out.println("总分排序");
		for(i=0;i<stu.length;i++) {
			System.out.println(stu[(int)arr[i][0]].getName()+":"+arr[i][1]);
			ar[i]=arr[i][1];
		}
				
		return ar;
		
	}






}
