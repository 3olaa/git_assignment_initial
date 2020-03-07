/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	private List<ISubscriber> subscribers;
	
	public Topic() {
		subscribers = new ArrayList<ISubscriber>();
	}
	
	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}
	
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}
	
	public void dispatchEvent(String input) {
		for (ISubscriber sub : this.getSubscribers()) {
			sub.notifySubscriber(input);
		}
	}
}
