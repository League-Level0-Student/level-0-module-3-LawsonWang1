package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
	
		String science = JOptionPane.showInputDialog("Do you want to learn about science?");
		if (science.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "It seems like you don't want to learn!");
		} else if (science.equalsIgnoreCase("yes")) {
			String fact = JOptionPane.showInputDialog("Did you know that sloths can hold their breath longer than dolphins?");
			if (fact.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Wow, you must be really smart!");
			} else if (fact.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Great, now you learned something new.");
			}
		}
	
	
	
	
	}
}	
