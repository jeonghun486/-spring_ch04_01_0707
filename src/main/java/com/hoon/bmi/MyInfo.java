package com.hoon.bmi;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BmiCalculator bmiCal;
	
	public void bmiCalculation() {
		bmiCal.bmiCalcu(weight, height);
	}
	
	public void getMyInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + weight);
		System.out.println("Ű : " + height);
		System.out.println("��� : " + hobbys);
		bmiCalculation();
		
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	

	public void setBmiCal(BmiCalculator bmiCal) {
		this.bmiCal = bmiCal;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
}
