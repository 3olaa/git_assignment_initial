/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

public class SphereCircumference implements ISubscriber  {
	
	 public void notifySubscriber(String input) {
	        double R = Double.parseDouble(input);
	        System.out.println("Sphere Circumference is  = " + (2*3.14*R));
	        
}
}
