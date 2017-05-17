import javax.swing.JOptionPane;

public class InputDialog

{public static void main( String[] args )

{

String nama = "";

nama = JOptionPane.showInputDialog("Please enter your name");

System.out.println("Nama anda : "+ nama );

}

}