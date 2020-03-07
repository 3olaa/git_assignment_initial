/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;


public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        double radius = Double.parseDouble ( input );
        double volume =((double)4/3) * Math.PI * Math.pow(radius,3) ;
        System.out.println("Sphere Volume is : " + volume);
    }
}
