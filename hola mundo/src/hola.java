import javax.swing.JOptionPane;

public class hola {

	public static void main(String[] args) {
	
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
		
		JOptionPane.showMessageDialog(null, "¡hola! ¿Que tal?"  + nombre );
		
	}

}
