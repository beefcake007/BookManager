package com.fanye.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u57FA\u672C\u7EF4\u62A4\u7BA1\u7406");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_shield_16px_1110481_easyicon.net.png")));
		menuBar.add(menu);
		
		JMenu mnNewMenu = new JMenu("\u56FE\u4E66\u7C7B\u522B\u7BA1\u7406");
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_attachment_16px_1110460_easyicon.net.png")));
		menu.add(mnNewMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTypeAddItemFrm bookTypeAddItemFrm=new BookTypeAddItemFrm();
				bookTypeAddItemFrm.setVisible(true);
				table.add(bookTypeAddItemFrm);
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_add_16px_1110459_easyicon.net.png")));
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u7EF4\u62A4");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTypeManageItemFrm bookTypeAddItemFrm=new BookTypeManageItemFrm();
				bookTypeAddItemFrm.setVisible(true);
				table.add(bookTypeAddItemFrm);
			}
		});
		menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_pencil_16px_1110476_easyicon.net.png")));
		mnNewMenu.add(menuItem_2);
		
		JMenu menu_2 = new JMenu("\u56FE\u4E66\u7BA1\u7406");
		menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_shield_16px_1110481_easyicon.net.png")));
		menu.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u56FE\u4E66\u6DFB\u52A0");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAddItemFrm bookAddItemFrm=new BookAddItemFrm();
				bookAddItemFrm.setVisible(true);
				table.add(bookAddItemFrm);
			}
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_add_16px_1110459_easyicon.net.png")));
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u56FE\u4E66\u7EF4\u62A4");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookManageItemFrm bookAddItemFrm=new BookManageItemFrm();
				bookAddItemFrm.setVisible(true);
				table.add(bookAddItemFrm);
			}
		});
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_pencil_16px_1110476_easyicon.net.png")));
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否继续退出!");
				if(result==0){
					dispose();
				}
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_cross_16px_1110465_easyicon.net.png")));
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/Lego_Superman_16px_1081984_easyicon.net.png")));
		menuBar.add(menu_1);
		
		JMenuItem mntmAboutFanye = new JMenuItem("About fanye");
		mntmAboutFanye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FanyeItemFrm fanyeItemFrm=new FanyeItemFrm();
				fanyeItemFrm.setVisible(true);
				table.add(fanyeItemFrm);
			}
		});
		mntmAboutFanye.setIcon(new ImageIcon(MainFrm.class.getResource("/images/admin_push_pin_16px_1110477_easyicon.net.png")));
		menu_1.add(mntmAboutFanye);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JDesktopPane();
		contentPane.add(table, BorderLayout.CENTER);
		
		/**
		 * JFrame最大化
		 */
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
