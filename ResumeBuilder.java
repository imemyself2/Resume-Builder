import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ResumeBuilder extends JFrame implements ActionListener{


    static JButton newButton1;
    static JButton newButton2;
    static JButton newButton3;
    static JButton newButton4;
    static JButton newButton5;
    static JButton newButton6;
    static JButton newButton7;
    static JButton newButton8;
    static JButton newButton9;
    static JButton newButton10;
    static JButton newButton11;
    static JButton newButton12;
    static JButton newButton13;
    static JPanel newPanel;
    static JTextField newName;
   
   public static String NAME;
    public static String EMAIL;
    
    public static void main(String args[])
    {
        JOptionPane pane = new JOptionPane("WELCOME TO RESUME BUILDER");
        pane.createDialog(null,"HELLO");
        int choice = JOptionPane.showConfirmDialog(pane,"CLICK YES TO CONTINUE");
        System.out.println(choice);

        if(choice == 0)
        {
            JFrame newFrame = new JFrame("Resume Builder");
            newFrame.setVisible(true);
            newFrame.setSize(1000,1000);
            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             newPanel = new JPanel(new GridBagLayout());
            newPanel.setBackground(Color.WHITE);

            newButton1 = new JButton("Contact Information");
            newButton1.setPreferredSize(new Dimension(220,25));
            newButton2 = new JButton("Objective");
            newButton2.setPreferredSize(new Dimension(220,25));
            newButton3 = new JButton("Education");
            newButton3.setPreferredSize(new Dimension(220,25));
            newButton4 = new JButton("Institution");
            newButton4.setPreferredSize(new Dimension(220,25));
            newButton5 = new JButton("GPA");
            newButton5.setPreferredSize(new Dimension(220,25));
            newButton6 = new JButton("Experience/Awards");
            newButton6.setPreferredSize(new Dimension(220,25));
            newButton7 = new JButton("Skills");
            newButton7.setPreferredSize(new Dimension(220,25));
            newButton8 = new JButton("Relevant Coursework");
            newButton8.setPreferredSize(new Dimension(220,25));
            
            newButton9 = new JButton("Projects");
            newButton9.setPreferredSize(new Dimension(220,25));
            
            
            newButton10 = new JButton("Publications");
            newButton10.setPreferredSize(new Dimension(220,25));
            newButton11 = new JButton("GENERATE RESUME");
            

             newName = new JTextField("",10);
             
            JTextField newNumber = new JTextField("Enter Number",10);
            JTextField newGender = new JTextField("Enter Gender",10);

            GridBagConstraints obj = new GridBagConstraints();
            //obj.insets = new Insets(40,0,30,0);tartScreen().getY()-100
//            obj.gridx = 1;
//            obj.gridy = 1;
//            newPanel.add(newButton1,obj);
//            obj.gridy = 2;
//            newPanel.add(newButton2,obj);
//            obj.gridy = 3;
//            newPanel.add(newButton3,obj);
//            obj.gridy = 4;
//            newPanel.add(newButton4,obj);
            
//            newPanel.add(newEmail);
//            newPanel.add(newNumber);
//            newPanel.add(newGender);
            //newPanel.setSize(1000,1000);
            
            
            
           JLabel tempLabel = StartScreen();
           
            newFrame.add(newPanel);
            newName.addActionListener(new ActionListener()
            		{
            			
            	public void actionPerformed(ActionEvent e) {
            		// TODO Auto-generated method stub
            		
            		NAME = newName.getText();
            		
            		
            		if(!getNamee().equals(""))
            		{
            			newFrame.setVisible(false);
            			SelectionUI obj = new SelectionUI();
            			
            		}
            		
            		
            	}
            		});
            
            newPanel.add(tempLabel);
            newPanel.add(newName);
           
            newFrame.add(newPanel);
            
           
            

        }
        //JOptionPane.showMessageDialog(null,"WELCOME TO THE RESUME BUILDER. CLICK NEXT TO CONTINUE.", "RESUME BUILDER", JOptionPane.PLAIN_MESSAGE);
    }
    
    
    static JLabel StartScreen()
    {
    	JLabel label1 = new JLabel("Welcome to Resume Builder! Please enter your name: ");
    	
  
    	newPanel.add(label1);
    	return label1;
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static String getNamee()
	{
		return NAME;
	}
	
	public static String getEmail()
	{
		return EMAIL;
	}


	
	


}