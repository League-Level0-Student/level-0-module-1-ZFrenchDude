package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {

	
String date=JOptionPane.showInputDialog("What is your birthday?");
if(date.equals("06/23")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");	
}
else {
JOptionPane.showMessageDialog(null, "Happy Unbirthday!");		
}
}

}

