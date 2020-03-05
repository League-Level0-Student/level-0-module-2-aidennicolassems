package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog("How old are you?");
	int Num=Integer.parseInt(Age);
	if  (Num>18){
	JOptionPane.showMessageDialog(null, "Who should be the next presdident?");
	}
	else
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
}
}
