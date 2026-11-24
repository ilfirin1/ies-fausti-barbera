import javax.swing.JOptionPane;

public class PedirInfo {
	public static void main(String[] args) {
		// Equivale a un scanner
		String edadIntroducida = JOptionPane.showInputDialog("Escribe "
				+ "tu edad");
		// Equivale a un println
		JOptionPane.showMessageDialog(null, edadIntroducida);
		
		int edad = Integer.parseInt(edadIntroducida);
		if (edad >= 18)
			JOptionPane.showMessageDialog(null, "Mayor de edad");
		else JOptionPane.showMessageDialog(null, "Menor de edad");

		
		String textoConfirmacion = "¿Tienes carnet de conducir?";
		int opcion = JOptionPane.showConfirmDialog(null, textoConfirmacion);
		
		// if (opcion == 0) -> Opción Sí
		if (opcion == JOptionPane.YES_OPTION) {
			String textoYes = "Has pulsado el botón YES.";
			JOptionPane.showMessageDialog(null, textoYes);
		}
		else if (opcion == 1){ // Opción no
			String textoNo = "Has pulsado el botón NO.";
			JOptionPane.showMessageDialog(null, textoNo);
		}
		else { // 2 -> Opción cancelar
			String textoCancel = "Has pulsado el botón Cancelar.";
			JOptionPane.showMessageDialog(null, textoCancel);
		}
	}
}
