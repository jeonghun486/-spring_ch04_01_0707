package com.hoon.bmi;

public class BmiCalculator {

	private double lowWeight;//��ü��
	private double normalWeight;//����ü��
	private double overWeight;//������
	private double obesityWeight;//��ü��
	
	public void bmiCalcu(double weight, double height) {
		//bmi ���� : ������ / (Ű*0.01)^2
		double height2 = height*(0.01);
		double bmiResult = weight / (height2*height2);
		
		System.out.println("BMI����:" + bmiResult);
		
		if(bmiResult > obesityWeight) {
			System.out.println("���Դϴ�.");
		} else if(bmiResult > overWeight) {
			System.out.println("��ü���Դϴ�");
		} else if(bmiResult > normalWeight) {
			System.out.println("����ü���Դϴ�.");
		} else {
			System.out.println("��ü���Դϴ�.");
		}
		
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesityWeight(double obesityWeight) {
		this.obesityWeight = obesityWeight;
	}
	
}
