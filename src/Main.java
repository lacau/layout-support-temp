import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Main dialog = new Main();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Main() {
		setResizable(false);
		setAutoRequestFocus(false);
		setBounds(100, 100, 800, 580);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 800, 580);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Menu", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panelMenu.setBounds(668, 12, 120, 179);
		contentPanel.add(panelMenu);
		panelMenu.setLayout(null);
		
		Button btScripts = new Button("load script");
		btScripts.setBounds(10, 15, 100, 23);
		panelMenu.add(btScripts);
		
		Button btLoadScript = new Button("scripts");
		btLoadScript.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btLoadScript.setBounds(10, 45, 100, 23);
		panelMenu.add(btLoadScript);
		
		Button btRun = new Button("RUN");
		btRun.setBounds(10, 75, 100, 23);
		panelMenu.add(btRun);
		
		JPanel panelBorder = new JPanel();
		panelBorder.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBorder.setBounds(12, 12, 644, 556);
		contentPanel.add(panelBorder);
		panelBorder.setLayout(null);
		
		JPanel panelDraw = new JPanel();
		panelDraw.setBackground(new Color(0, 0, 0));
		panelDraw.setBounds(10, 10, 624, 536);
		panelBorder.add(panelDraw);
		panelDraw.setLayout(null);
	}
}
