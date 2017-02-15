package com.equationcreator.cubic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("x feet");
		double x = s.nextDouble();
		System.out.println("y feet");
		double y = s.nextDouble();
		System.out.println("end angle");
		double angle = s.nextDouble();

		System.out.println(EquationCreator.MakeCubicEquation(x,y,angle).toString());
		s.close();
	}
}
