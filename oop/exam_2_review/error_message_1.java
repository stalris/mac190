// JOptionPane.showMessageDialog has three signatures. In other words showMessageDialog is a method that is overloaded.
// This is an example of the first signature.
// per the Oracle Documentation at
//
// https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html#showMessageDialog-java.awt.Component-java.lang.Object-a
//
// This method has the following signature:
//
// public static void showMessageDialog(Component parentComponent,
// 					Object message)
// 				throws HeadlessException
//
// Parameter description: 
// 	parentComponent - The frame in which the dialog is displayed. If null then a default frame is used.
// 	message - A string that is placed inside the dialog box.

import javax.swing.*;

public class error_message_1 {
	public static void main(String [] args){
		JOptionPane.showMessageDialog(null, "This is a string placed inside the dialog box. Defaults to a title of 'Message'");
	}
}
