package com.info.image;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JTextField;

public class Project {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
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
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024	,1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Encrypt");
		btnNewButton_1.setBounds(104, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Browse");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(314, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(413, 11, 89, 23);
		frame.getContentPane().add(btnEncrypt);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(633, 11, 89, 23);
		frame.getContentPane().add(btnBrowse);
		
		JButton btnEncrypt_1 = new JButton("Encrypt");
		btnEncrypt_1.setBounds(744, 11, 89, 23);
		frame.getContentPane().add(btnEncrypt_1);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(512, 11, 89, 23);
		frame.getContentPane().add(btnDecrypt);
		
		JButton btnDecrypt_1 = new JButton("Decrypt");
		btnDecrypt_1.setBounds(199, 11, 89, 23);
		frame.getContentPane().add(btnDecrypt_1);
		
		JButton btnDecrypt_2 = new JButton("Decrypt");
		btnDecrypt_2.setBounds(853, 11, 89, 23);
		frame.getContentPane().add(btnDecrypt_2);
		Canvas canvas = new Canvas();
		canvas.setBounds(10, 104, 278, 172);
		frame.getContentPane().add(canvas);
		canvas.setBackground(new Color(0, 155, 155));
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBounds(314, 104, 287, 172);
		frame.getContentPane().add(canvas_1);
		canvas_1.setBackground(new Color(0, 155, 155));
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBounds(633, 104, 284, 172);
		frame.getContentPane().add(canvas_2);
		canvas_2.setBackground(new Color(0, 155, 155));
		textField = new JTextField();
		textField.setBounds(10, 54, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 54, 178, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(655, 54, 178, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBounds(182, 405, 262, 226);
		frame.getContentPane().add(canvas_3);
		canvas_3.setBackground(new Color(0, 55, 155));
		Canvas canvas_4 = new Canvas();
		canvas_4.setBounds(563, 405, 270, 226);
		frame.getContentPane().add(canvas_4);
		canvas_4.setBackground(new Color(0, 55, 155));
		
		JButton btnAnalyze = new JButton("Analyze");
		btnAnalyze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnalyze.setBounds(442, 343, 89, 23);
		frame.getContentPane().add(btnAnalyze);
	}
}
