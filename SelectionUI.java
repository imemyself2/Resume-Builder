import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SelectionUI extends ResumeBuilder {
	
	JFrame mainFrame;
	JPanel mainPanel;
	ResumeBuilder objj = new ResumeBuilder();
	GridBagConstraints obj1 = new GridBagConstraints();
	JLabel welcome;
	ArrayList<String> mobile = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<String> website = new ArrayList<String>();
	
	SelectionUI()
	{
		mainFrame = new JFrame("Selection Page");
		mainPanel = new JPanel(new GridBagLayout());
		welcome = new JLabel("  || Welcome "+ResumeBuilder.getNamee()+" || ");
		welcome.setSize(100,40);
		welcome.setFont(new Font("Times New Roman",Font.BOLD,25));
		welcome.setForeground(Color.WHITE);
		
		welcome.setLocation(2, -15);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1000, 1000);
		mainPanel.setSize(1000, 1000);
		mainPanel.setBackground(Color.BLACK);
		setScreen();
	}
	
	void setScreen()
	{
		
		
//		obj1.gridx = 2;
//		obj1.gridy =-15;
		obj1.insets = new Insets(2, 2, 2, 2);
	    //obj1.weighty = 1.0;
	    obj1.weightx = 1.0;
	    obj1.gridx = 2;
	    obj1.gridy = 0;
	   // obj1.gridheight = 2;
	    
	    welcome.setHorizontalAlignment(JLabel.CENTER);
	    
		
		mainPanel.add(welcome,obj1);
		obj1.insets = new Insets(20,20,20,20);
		obj1.gridx = 1;
		obj1.gridy = 1;
		mainPanel.add(ResumeBuilder.newButton1,obj1);
		obj1.gridx = 1;
		obj1.gridy = 2;
		mainPanel.add(ResumeBuilder.newButton2,obj1);
		obj1.gridx = 1;
		obj1.gridy = 3;
		mainPanel.add(ResumeBuilder.newButton3,obj1);
		obj1.gridx = 1;
		obj1.gridy = 4;
		mainPanel.add(ResumeBuilder.newButton4,obj1);
		obj1.gridx = 1;
		obj1.gridy = 5;
		mainPanel.add(ResumeBuilder.newButton5,obj1);
		obj1.gridx = 3;
		obj1.gridy = 1;
		mainPanel.add(ResumeBuilder.newButton6,obj1);
		obj1.gridx = 3;
		obj1.gridy = 2;
		mainPanel.add(ResumeBuilder.newButton7,obj1);
		obj1.gridx = 3;
		obj1.gridy = 3;
		mainPanel.add(ResumeBuilder.newButton8,obj1);
		obj1.gridx = 3;
		obj1.gridy = 4;
		mainPanel.add(ResumeBuilder.newButton9,obj1);
		obj1.gridx = 3;
		obj1.gridy = 5;
		mainPanel.add(ResumeBuilder.newButton10,obj1);
		obj1.gridx = 2;
		obj1.gridy = 9;
		mainPanel.add(ResumeBuilder.newButton11,obj1);
		
		
		mainFrame.add(mainPanel);
		
		ResumeBuilder.newButton1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String inp = JOptionPane.showInputDialog(null,"FORMAT = <field>: <field info> ( FIELDS : Email, Phone, Website )","",JOptionPane.PLAIN_MESSAGE);
						if(inp.contains("Email: "))
						{
							String temp = inp.substring(7,inp.length());
							email.add(temp);
						}
						else if(inp.contains("Phone: "))
						{
							String temp = inp.substring(7,inp.length());
							mobile.add(temp);
							
						}
						else if(inp.contains("Website: "))
						{
							String temp = inp.substring(9,inp.length());
							website.add(temp);
						}
						
							
					
					}
				});
		
		ResumeBuilder.newButton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String inp = JOptionPane.showInputDialog(null,"FORMAT = <field>: <field info> ( FIELDS : Email, Phone, Website )");
				if(inp.contains("Email: "))
				{
					String temp = inp.substring(7,inp.length());
					email.add(temp);
				}
				else if(inp.contains("Phone: "))
				{
					String temp = inp.substring(7,inp.length());
					mobile.add(temp);
					
				}
				else if(inp.contains("Website: "))
				{
					String temp = inp.substring(9,inp.length());
					website.add(temp);
				}
				
					
			
			}
		});
		
		
		
	}
	
	
	

}
