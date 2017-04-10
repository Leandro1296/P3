import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaPuzzle {

	private JFrame frame;
	private JButton boton_1;
	private JButton boton_2;
	private JButton boton_3;
	private JButton boton_4;
	private JButton boton_5;
	private JButton boton_6;
	private JButton boton_7;
	private JButton boton_8;
	private JButton boton_9;
	private JButton boton_10;
	private JButton boton_11;
	private JButton boton_12;
	private JButton boton_13;
	private JButton boton_14;
	private JButton boton_15;
	private JButton boton_vacio;
	private ArrayList<String> txtBotones;
	private ArrayList<JButton> botones;
	private ArrayList<String> solucion;
	private JPanel panel_1;
	private static int contador = 1;
	private JTextField textContador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPuzzle window = new VentanaPuzzle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPuzzle() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFocusCycleRoot(true);
		frame.setVisible(true);
		frame.setFocusTraversalPolicyProvider(true);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.requestFocus();
			}
		});
		frame.setTitle("Rompecabezas Deslizable");
		frame.setBounds(100, 100, 615, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtBotones = new ArrayList<>();
		botones = new ArrayList<>();
		solucion = new ArrayList<>();

		panel_1 = new JPanel();
		panel_1.setDoubleBuffered(false);
		panel_1.setFocusTraversalPolicyProvider(true);
		panel_1.setFocusCycleRoot(true);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_1.requestFocus();
			}
		});
		panel_1.setBackground(Color.GREEN);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBounds(10, 11, 504, 346);
		frame.getContentPane().add(panel_1);

		panel_1.setLayout(new GridLayout(4, 4));
		generarBotones(panel_1);

		textContador = new JTextField();
		textContador.setFocusable(false);
		textContador.setHorizontalAlignment(SwingConstants.CENTER);
		textContador.setBounds(534, 308, 42, 20);
		frame.getContentPane().add(textContador);
		textContador.setColumns(10);

		JLabel movimientos = new JLabel("Movimientos");
		movimientos.setHorizontalAlignment(SwingConstants.CENTER);
		movimientos.setBounds(524, 283, 65, 14);
		frame.getContentPane().add(movimientos);
		leerTeclas();
		System.out.println(txtBotones.toString());
		System.out.println(solucion.toString());

		for (int i = 0; i < botones.size(); i++) {
			botones.get(i).setText(txtBotones.get(i));
		}
	}

	private void generarBotones(JPanel panel) {
		boton_1 = new JButton("1");
		boton_1.setFocusPainted(false);
		boton_1.setFocusTraversalKeysEnabled(false);
		boton_1.setFocusable(false);
		panel.add(boton_1);
		txtBotones.add(boton_1.getText());
		solucion.add(boton_1.getText());
		botones.add(boton_1);

		boton_2 = new JButton("2");
		boton_2.setFocusPainted(false);
		boton_2.setFocusTraversalKeysEnabled(false);
		boton_2.setFocusable(false);
		panel.add(boton_2);
		txtBotones.add(boton_2.getText());
		solucion.add(boton_2.getText());
		botones.add(boton_2);

		boton_3 = new JButton("3");
		boton_3.setFocusPainted(false);
		boton_3.setFocusTraversalKeysEnabled(false);
		boton_3.setFocusable(false);
		panel.add(boton_3);
		txtBotones.add(boton_3.getText());
		solucion.add(boton_3.getText());
		botones.add(boton_3);

		boton_4 = new JButton("4");
		boton_4.setFocusPainted(false);
		boton_4.setFocusTraversalKeysEnabled(false);
		boton_4.setFocusable(false);
		panel.add(boton_4);
		txtBotones.add(boton_4.getText());
		solucion.add(boton_4.getText());
		botones.add(boton_4);

		boton_5 = new JButton("5");
		boton_5.setFocusPainted(false);
		boton_5.setFocusTraversalKeysEnabled(false);
		boton_5.setFocusable(false);
		panel.add(boton_5);
		txtBotones.add(boton_5.getText());
		solucion.add(boton_5.getText());
		botones.add(boton_5);

		boton_6 = new JButton("6");
		boton_6.setFocusPainted(false);
		boton_6.setFocusTraversalKeysEnabled(false);
		boton_6.setFocusable(false);
		panel.add(boton_6);
		txtBotones.add(boton_6.getText());
		solucion.add(boton_6.getText());
		botones.add(boton_6);

		boton_7 = new JButton("7");
		boton_7.setFocusPainted(false);
		boton_7.setFocusTraversalKeysEnabled(false);
		boton_7.setFocusable(false);
		panel.add(boton_7);
		txtBotones.add(boton_7.getText());
		solucion.add(boton_7.getText());
		botones.add(boton_7);

		boton_8 = new JButton("8");
		boton_8.setFocusPainted(false);
		boton_8.setFocusTraversalKeysEnabled(false);
		boton_8.setFocusable(false);
		panel.add(boton_8);
		txtBotones.add(boton_8.getText());
		solucion.add(boton_8.getText());
		botones.add(boton_8);

		boton_9 = new JButton("9");
		boton_9.setFocusPainted(false);
		boton_9.setFocusTraversalKeysEnabled(false);
		boton_9.setFocusable(false);
		panel.add(boton_9);
		txtBotones.add(boton_9.getText());
		solucion.add(boton_9.getText());
		botones.add(boton_9);

		boton_10 = new JButton("10");
		boton_10.setFocusPainted(false);
		boton_10.setFocusTraversalKeysEnabled(false);
		boton_10.setFocusable(false);
		panel.add(boton_10);
		txtBotones.add(boton_10.getText());
		solucion.add(boton_10.getText());
		botones.add(boton_10);

		boton_11 = new JButton("11");
		boton_11.setFocusPainted(false);
		boton_11.setFocusTraversalKeysEnabled(false);
		boton_11.setFocusable(false);
		panel.add(boton_11);
		txtBotones.add(boton_11.getText());
		solucion.add(boton_11.getText());
		botones.add(boton_11);

		boton_12 = new JButton("12");
		boton_12.setFocusPainted(false);
		boton_12.setFocusTraversalKeysEnabled(false);
		boton_12.setFocusable(false);
		panel.add(boton_12);
		txtBotones.add(boton_12.getText());
		solucion.add(boton_12.getText());
		botones.add(boton_12);

		boton_13 = new JButton("13");
		boton_13.setFocusPainted(false);
		boton_13.setFocusTraversalKeysEnabled(false);
		boton_13.setFocusable(false);
		panel.add(boton_13);
		txtBotones.add(boton_13.getText());
		solucion.add(boton_13.getText());
		botones.add(boton_13);

		boton_14 = new JButton("14");
		boton_14.setFocusPainted(false);
		boton_14.setFocusTraversalKeysEnabled(false);
		boton_14.setFocusable(false);
		panel.add(boton_14);
		txtBotones.add(boton_14.getText());
		solucion.add(boton_14.getText());
		botones.add(boton_14);

		boton_15 = new JButton("15");
		boton_15.setFocusPainted(false);
		boton_15.setFocusTraversalKeysEnabled(false);
		boton_15.setFocusable(false);
		panel.add(boton_15);
		txtBotones.add(boton_15.getText());
		solucion.add(boton_15.getText());//
		botones.add(boton_15);

		boton_vacio = new JButton("");
		boton_vacio.setFocusPainted(false);
		boton_vacio.setFocusTraversalKeysEnabled(false);
		boton_vacio.setContentAreaFilled(false);
		actionBtns();
		panel.add(boton_vacio);
		
		Collections.shuffle(txtBotones);
		txtBotones.add(boton_vacio.getText());
		solucion.add(boton_vacio.getText());
		botones.add(boton_vacio);

	}

	private void actionBtns() {
		actionBtn1();
		actionBtn2();
		actionBtn3();
		actionBtn4();
		actionBtn5();
		actionBtn6();
		actionBtn7();
		actionBtn8();
		actionBtn9();
		actionBtn10();
		actionBtn11();
		actionBtn12();
		actionBtn13();
		actionBtn14();
		actionBtn15();
		actionBtnVacio();
	}

	private void actionBtn1() {
		boton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyLeft(boton_2, boton_1, arg0);
				keyUp(boton_5, boton_1, arg0);
			}
		});
	}

	private void actionBtn2() {
		boton_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyRight(boton_1, boton_2, arg0);
				keyLeft(boton_3, boton_2, arg0);
				keyUp(boton_6, boton_2, arg0);
			}
		});
	}

	private void actionBtn3() {
		boton_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyRight(boton_2, boton_3, arg0);
				keyLeft(boton_4, boton_3, arg0);
				keyUp(boton_7, boton_3, arg0);
			}
		});
	}

	private void actionBtn4() {
		boton_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyRight(boton_3, boton_4, arg0);
				keyUp(boton_8, boton_4, arg0);
			}
		});
	}

	private void actionBtn5() {
		boton_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_1, boton_5, arg0);
				keyLeft(boton_6, boton_5, arg0);
				keyUp(boton_9, boton_5, arg0);
			}
		});
	}

	private void actionBtn6() {
		boton_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_2, boton_6, arg0);
				keyRight(boton_5, boton_6, arg0);
				keyLeft(boton_7, boton_6, arg0);
				keyUp(boton_10, boton_6, arg0);
			}
		});
	}

	private void actionBtn7() {
		boton_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_3, boton_7, arg0);
				keyRight(boton_6, boton_7, arg0);
				keyLeft(boton_8, boton_7, arg0);
				keyUp(boton_11, boton_7, arg0);
			}
		});
	}

	private void actionBtn8() {
		boton_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_4, boton_8, arg0);
				keyRight(boton_7, boton_8, arg0);
				keyUp(boton_12, boton_8, arg0);
			}
		});
	}

	private void actionBtn9() {
		boton_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_5, boton_9, arg0);
				keyLeft(boton_10, boton_9, arg0);
				keyUp(boton_13, boton_9, arg0);
			}
		});
	}

	private void actionBtn10() {
		boton_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_6, boton_10, arg0);
				keyRight(boton_9, boton_10, arg0);
				keyLeft(boton_11, boton_10, arg0);
				keyUp(boton_14, boton_10, arg0);
			}
		});
	}

	private void actionBtn11() {
		boton_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_7, boton_11, arg0);
				keyRight(boton_10, boton_11, arg0);
				keyLeft(boton_12, boton_11, arg0);
				keyUp(boton_15, boton_11, arg0);
			}
		});
	}

	private void actionBtn12() {
		boton_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_8, boton_12, arg0);
				keyRight(boton_11, boton_12, arg0);
				keyUp(boton_vacio, boton_12, arg0);
			}
		});
	}

	private void actionBtn13() {
		boton_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_9, boton_13, arg0);
				keyLeft(boton_14, boton_13, arg0);
			}
		});
	}

	private void actionBtn14() {
		boton_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyRight(boton_13, boton_14, arg0);
				keyDown(boton_10, boton_14, arg0);
				keyLeft(boton_15, boton_14, arg0);
			}
		});
	}

	private void actionBtn15() {
		boton_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyRight(boton_14, boton_15, arg0);
				keyDown(boton_11, boton_15, arg0);
				keyLeft(boton_vacio, boton_15, arg0);
			}
		});
	}

	private void actionBtnVacio() {
		boton_vacio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyDown(boton_12, boton_vacio, arg0);
				keyRight(boton_15, boton_vacio, arg0);
			}
		});
	}

	private void keyDown(JButton btnA, JButton btnB, KeyEvent arg0) {
		if (!btnA.isFocusable() && arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			cambiarBoton(btnA, btnB);
			// contarMovimiento();
		}
	}

	private void keyUp(JButton btnA, JButton btnB, KeyEvent arg0) {
		if (!btnA.isFocusable() && arg0.getKeyCode() == KeyEvent.VK_UP) {
			cambiarBoton(btnA, btnB);
			// contarMovimiento();
		}
	}

	private void keyRight(JButton btnA, JButton btnB, KeyEvent arg0) {
		if (!btnA.isFocusable() && arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			cambiarBoton(btnA, btnB);
		}
	}

	private void keyLeft(JButton btnA, JButton btnB, KeyEvent arg0) {
		if (!btnA.isFocusable() && arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			cambiarBoton(btnA, btnB);
		}
	}
	

	private void cambiarBoton(JButton btnA, JButton btnB) {
		String aux = btnA.getText();
		int aux1 = txtBotones.indexOf(btnB.getText()); 
		txtBotones.set(txtBotones.indexOf(btnA.getText()), txtBotones.get(txtBotones.indexOf(btnB.getText())));
		txtBotones.set(aux1,aux);
		btnA.setText(btnB.getText());
		//btnA.setIcon(btnB.getIcon());
		btnB.setText(aux);
		btnA.setFocusable(true);
		btnB.setFocusable(false);
		btnA.setContentAreaFilled(false);
		btnB.setContentAreaFilled(true);
		contarMovimiento();
		verificar();
		System.out.println(txtBotones.toString()+" txt");System.out.println(solucion+" solucion");
	}

	
	private void contarMovimiento() {
		textContador.setText(String.valueOf(contador++));
	}
	

	private void gano() {
		JOptionPane.showMessageDialog(panel_1, "FELICIDADES GANO");
		boton_vacio.setFocusable(false);
	}
	

	private void verificar() {
		if (compararLista(txtBotones, solucion)) {
			gano();
		}
	}
	

	private boolean compararLista(ArrayList<String> lista1,
			ArrayList<String> lista2) {
		for (int i = 0; i < lista1.size(); i++) {
			if (!Objects.equals(lista1.get(i), lista2.get(i)))
				return false;
		}
		return true;
	}
	

	private void leerTeclas() {
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_UP) {
					frame.getContentPane().setBackground(Color.BLUE);
				}
				if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
					frame.getContentPane().setBackground(Color.RED);
				}
			}
		});
	}
}
