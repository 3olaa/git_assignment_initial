/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;


public class CircleCircumference implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double r=Double.parseDouble(input);
		System.out.println("circle circumference = "+(2*3.14*r));
	}

}

