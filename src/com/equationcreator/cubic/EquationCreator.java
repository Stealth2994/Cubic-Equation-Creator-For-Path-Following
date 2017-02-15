package com.equationcreator.cubic;

import java.text.DecimalFormat;

public class EquationCreator {
	
	public static CubicEquation MakeCubicEquation(double x, double y, double theta) {
		Coordinates c = new Coordinates(x,y);
		c.rotateRight();
		double tangent = -Math.tan(theta);
		double eq1a = Math.pow(c.x, 3);
		double eq1b = Math.pow(c.x, 2);
		double eq1y = c.y;
		
		double eq2a = Math.pow(c.x, 2) * 3;
		double eq2b = c.x * 2;
		
		double multiplier = eq1b / eq2b;
		eq2a *= multiplier;
		eq2b *= multiplier;
		double mTan = tangent * multiplier;
		double a = (eq1y - mTan) / (eq1a - eq2a);
		double b = ((eq1y - (eq1a * a)) / eq1b);
		
		return new CubicEquation(-a,-b,0,0);
	}
	
}
