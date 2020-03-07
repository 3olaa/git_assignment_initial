/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

public class multiplicationSeries implements ISubscriber {
    public void notifySubscriber(String input) 
    {
	int number = Integer.parseInt(input);
        for(int i=1; i <= number; i++)
        {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}