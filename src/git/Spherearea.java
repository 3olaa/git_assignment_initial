/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;


public class Spherearea implements ISubscriber{
	
	@Override
    public void notifySubscriber(String input) {
        double radius = Double.parseDouble(input);
        String result = String.valueOf(4*3.14*radius*radius);
        System.out.println("Sphere area = " + result);
    }
}


  