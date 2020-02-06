package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	

Random ran = new Random();
int num1 = ran.nextInt(10);

int num2 = ran.nextInt(10);

int num3 = ran.nextInt(10);

int num4 = ran.nextInt(10);

int num5 = ran.nextInt(10);

JOptionPane.showMessageDialog(null, "Your lottery ticket number is "+ num1+" "+num2+" "+num3+" "+num4+" "+num5 );





















}}