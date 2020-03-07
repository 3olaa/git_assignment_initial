/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;
public class ReallySimpleSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
	}
}
