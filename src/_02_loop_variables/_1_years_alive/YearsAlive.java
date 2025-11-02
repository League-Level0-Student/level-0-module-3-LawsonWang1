package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {
	
	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("How old will you be at the end of this year?");
		int ageAsInt = Integer.parseInt(age);
		int x = 0;
		for(x = ageAsInt; x >= 0; x--) {
			System.out.println(2025   - x);
		}
	
	}
}
