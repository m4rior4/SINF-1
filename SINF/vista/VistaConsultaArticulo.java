package vista;

import javax.swing.JInternalFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
public class VistaConsultaArticulo extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String nomTabla;
	public static String dato, titulo;
	private JTextField txtBuscar;
	private JTextField textField_3;
	public JButton btnConsultar;
	private JTextField textField;
	private JTextField textField_1;
	public JTable tabla;
	public VistaConsultaArticulo() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Articulos");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(10, 10, 577, 488);
		getContentPane().setLayout(new MigLayout("", "[106.00,grow]", "[][370.00,grow,bottom][bottom]"));

		JButton btnModficar = new JButton("Modficar");
		btnModficar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModficar.setBackground(Color.WHITE);
		btnModficar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnModficar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnModficar.setFont(new Font("Arial", Font.BOLD, 14));
		
		txtBuscar = new JERoundTextField();
		txtBuscar.setBackground(new Color(187,202,204));
		txtBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		txtBuscar.setFont(new Font("Arial", Font.BOLD, 14));
		txtBuscar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(txtBuscar, "cell 0 0,growx");
		txtBuscar.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(234, 254, 255));
		panel.setBackground(new Color(58, 63, 64));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar/Modificar Articulo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(234, 254, 255)));
		getContentPane().add(panel, "cell 0 2,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		JLabel lblPlaca = new JLabel("Articulo");
		lblPlaca.setFont(new Font("Arial", Font.BOLD, 14));
		lblPlaca.setForeground(new Color(234, 254, 255));
		panel.add(lblPlaca, "flowx,cell 0 0,alignx left");
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.BOLD, 14));
		textField_3.setBackground(new Color(187,202,204));
		textField_3.setColumns(10);
		panel.add(textField_3, "cell 0 0,alignx left");
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("Arial", Font.BOLD, 14));
		lblDescripcin.setForeground(new Color(234, 254, 255));
		panel.add(lblDescripcin, "cell 0 0");
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 14));
		textField.setBackground(new Color(187,202,204));
		textField.setColumns(10);
		panel.add(textField, "cell 0 0,growx");
		
		JLabel lblRegistros = new JLabel("Sanci\u00F3n");
		lblRegistros.setFont(new Font("Arial", Font.BOLD, 14));
		lblRegistros.setForeground(new Color(234, 254, 255));
		panel.add(lblRegistros, "cell 0 0");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 14));
		textField_1.setBackground(new Color(187,202,204));
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 0 0,growx");
		
		btnConsultar = new JButton("Insertar");
		btnConsultar.setForeground(new Color(58, 63, 64));
		panel.add(btnConsultar, "cell 0 0,alignx right");
		btnConsultar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConsultar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 14));
		btnConsultar.setBackground(new Color(234, 254, 255));
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 1,grow");
		
		tabla = new JTable();
		tabla.setFont(new Font("Arial", Font.BOLD, 14));
		tabla.setBackground(Color.WHITE);
		scrollPane.setViewportView(tabla);
	}
	
	
//	public void traerdatos() {
//		int fila=tabla.getSelectedRow();//es paara traer la fila seleccionada el getSelectedRow
//		if (Principal.usuario=="Invitado") {//verificar el tipo de usuario Para asignarle permisos
//			JOptionPane.showMessageDialog(null, "Lo siento no tienes permisos para realizar esta accion");
//		}else {
//			switch (nomTabla){
//			case "persona":	
//				if (fila>-1) {//el getSelectedRow empieza del -1 es igual a ==0, indica que no tenemos ninguno seleccionado
//					persona Co= new persona();//para poder modificar una clase es necesario crear su clase MODIFICARLIBRO
//					Principal.dpEscritorio.add(Co);
//					Co.show();
//					dato=(String) tabla.getValueAt(fila, 0);
//					try {
//						conexiones.ModificarBD.rellenarpersona(dato);
//					} catch (HeadlessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//						//                                  } catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "No se a detectado ninguan fila seleccionada");
//				}
//				break;
//			case "revista":
//				if (fila>-1) {
//					revista Co= new revista();//para poder modificar una clase es necesario crear su clase MODIFICARLIBRO
//					Principal.dpEscritorio.add(Co);
//					Co.show();
//					dato=(String) tabla.getValueAt(fila, 0);
//					try {
//						conexiones.ModificarBD.rellenarrevista(dato);
//					} catch (HeadlessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "No se a detectado ninguan fila seleccionada");
//
//				}break;
//			case "disco":
//				if (fila>-1) {
//					disco Md= new disco();
//					Principal.dpEscritorio.add(Md);
//					Md.show();
//					dato=(String) tabla.getValueAt(fila, 0);
//					try {
//						conexiones.ModificarBD.rellenarDisco(dato);
//					} catch (HeadlessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "No se a detectado ninguan fila seleccionada");
//				}break;
//			case "libro":
//				if (fila>-1) {
//					libro Co= new libro();//para poder modificar una clase es necesario crear su clase MODIFICARLIBRO
//					Principal.dpEscritorio.add(Co);
//					Co.show();
//					dato=(String) tabla.getValueAt(fila, 0);
//					try {
//						conexiones.ModificarBD.rellenalibro(dato);
//					} catch (HeadlessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "No se a detectado ninguan fila seleccionada");
//
//				}break;
//			case "tesoreria":
//				if (fila>-1) {
//					tesoreria Co= new tesoreria();//para poder modificar una clase es necesario crear su clase MODIFICARLIBRO
//					Principal.dpEscritorio.add(Co);
//					Co.show();
//					dato=(String) tabla.getValueAt(fila, 0);
//					try {
//						conexiones.ModificarBD.rellenartesoreria(dato);
//					} catch (HeadlessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "No se a detectado ninguan fila seleccionada");
//				}
//			}
//		}
//	}
}
