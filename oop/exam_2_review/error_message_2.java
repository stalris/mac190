// JOptionPane.showMessageDialog has three different signatures. This is an example of the second signature.
// per the Oracle documentation at 
//
// https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html#showMessageDialog-java.awt.Component-java.lang.Object-java.lang.String-int-
//
// This method has the following signature:
//
// public static void showMessageDialog(Component parentComponent,
//					Object message,
//					String title,
//					int messageType)
//				throws HeadlessException
//
// Parameter descriptions:
//
//	parentComponent - The frame in which the dialog is displayed. If null, a default frame is used.
//	message - A string that is placed inside the dialog box 
//	title - A string placed on the top of the dialog box
//	messageType - the type of message to be displayed. Options are:
//		ERROR_MESSAGE
//		INFORMATION_MESSAGE
//		WARNING_MESSAGE
//		QUESTION_MESSAGE
//		PLAIN_MESSAGE

import javax.swing.JOptionPane;

public class error_message_2 {
	public static void main(String [] args){

		// This shows a message of type ERROR_MESSAGE
		JOptionPane.showMessageDialog(null, "message inside the dialog box", "title placed on top of the dialog box", JOptionPane.ERROR_MESSAGE);

		// This shows a message of type INFORMATION_MESSAGE.
		// uncomment to check.
		//JOptionPane.showMessageDialog(null, "message inside the dialog box", "title placed on top of the box", JOptionPane.INFORMATION_MESSAGE);
	}
}
