package Game;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class tictactoe extends JFrame {
	
    	
	 JButton  button1 = new JButton();
     JButton  button2 = new JButton();
     JButton  button3 = new JButton();
     JButton  button4 = new JButton();
     JButton  button5 = new JButton();
     JButton  button6 = new JButton();
     JButton  button7 = new JButton();
     JButton  button8 = new JButton();
     JButton  button9 = new JButton();
     int i = 0 ;
 //    boolean a = false ;
 //    boolean b = false ;
 //    boolean c = false ;
 //    boolean d = false ;
 //    boolean f = false ;
 //    boolean g = false ;
 //    boolean h = false ;
 //    boolean i = false ;
  //   boolean j = false ;
        public tictactoe() {
             
        	initComponents();
        }

        private void ActionPerformed1(ActionEvent e) {
        
            if (button1.getText().equals("") && (Main.turnplayer == true )){
            	Font police = new Font("Thoma",Font.BOLD,25);
          		button1.setFont(police);	
            	button1.setText("X");
            		Main.turnplayer=false;
          		 button1.setBackground(Color.RED);
            //	 a = true ;	 
          		 i+=1;
            	}
            	else if (button1.getText().equals("") && (Main.turnplayer == false )){
            		
            		Font police = new Font("Thoma",Font.BOLD,25);
              		button1.setFont(police);
            		
            		button1.setText("O");
            		Main.winner();
            		Main.turnplayer = true ;
            	  button1.setBackground(Color.YELLOW);	 
            	 //  a = true ;
            	  i+=1;
            	}
            }
        
 
        private void ActionPerformed2(ActionEvent e) {
        	
        	 if (button2.getText().equals("") && (Main.turnplayer == true )){
             		
             		Font police = new Font("Thoma",Font.BOLD,25);
             		button2.setFont(police);
             		button2.setText("X");
             		Main.turnplayer=false;
               button2.setBackground(Color.RED);
                //b = true ;
               i+=1;
        	 }
        	 else if (button2.getText().equals("") && (Main.turnplayer == false )){
             		
        		 Font police = new Font("Thoma",Font.BOLD,25);
          		button2.setFont(police);
        		 button2.setText("O");
             		
             		Main.winner();
             		Main.turnplayer = true ;
               button2.setBackground(Color.YELLOW);
               //b = true ;
               i+=1;	
        	 }
            }
 
        private void ActionPerformed3(ActionEvent e) {
        	 
        	if (button3.getText().equals("") && (Main.turnplayer == true )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button3.setFont(police);	
        		
        		button3.setText("X");
             		Main.turnplayer=false;
              	  button3.setBackground(Color.RED);	
              	 //c = true ;
              	i+=1;
        	}
        	else if (button3.getText().equals("") && (Main.turnplayer == false )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button3.setFont(police);	
        		button3.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
            	  button3.setBackground(Color.YELLOW);
             	// c = true ;
            	  i+=1; 	
        	}
            }
        
 
        private void ActionPerformed4(ActionEvent e) {
        	 if (button4.getText().equals("") && (Main.turnplayer == true )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button4.setFont(police);	
        		 
        		 button4.setText("X");
             		Main.turnplayer=false;
             		button4.setBackground(Color.RED);
             	 //d = true;
             		i+=1;		
        	 }
        	 else if (button4.getText().equals("") && (Main.turnplayer == false )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button4.setFont(police);	
        		 
        		 button4.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
             		  button4.setBackground(Color.YELLOW);
             //	 d = true ;
             		 i+=1;
        	 }
             }
        
 
        private void ActionPerformed5(ActionEvent e) {
        	 
        	if (button5.getText().equals("") && (Main.turnplayer == true )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button5.setFont(police);	
        		
        		button5.setText("X");
             		Main.turnplayer=false;
             		  button5.setBackground(Color.RED);
             	      //f = true ;
             		 i+=1;
        	}
        	else if (button5.getText().equals("") && (Main.turnplayer == false )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button5.setFont(police);	
        		
        		button5.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
             	  button5.setBackground(Color.YELLOW);
             		 // f = true;
             	 i+=1; 
        	}
             }
        
 
        private void ActionPerformed6(ActionEvent e) {
        	
        	if (button6.getText().equals("") && (Main.turnplayer == true )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button6.setFont(police);	
        		
        		button6.setText("X");
             		Main.turnplayer=false;
             	  button6.setBackground(Color.RED);
             	   //g = true;
             	 i+=1;	 
        	}
        	else if (button6.getText().equals("") && (Main.turnplayer == false )){
        		Font police = new Font("Thoma",Font.BOLD,25);
          		button6.setFont(police);	
        		
        		button6.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
             		  button6.setBackground(Color.YELLOW);
                  // g = true ;
             		 i+=1;
        	}
             }
        
 
        private void ActionPerformed7(ActionEvent e) {
        	 if (button7.getText().equals("") && (Main.turnplayer == true )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button7.setFont(police);	
        		 
        		 button7.setText("X");
             		Main.turnplayer=false;
             		  button7.setBackground(Color.RED);
             		//h = true;
             		 i+=1; 
        	 }
        	 else if (button7.getText().equals("") && (Main.turnplayer == false )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button7.setFont(police);	
        		 
        		 button7.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
             		  button7.setBackground(Color.YELLOW);
             	//	h = true;
             		 i+=1;
        	 
        	 }
             }
        
 
        private void ActionPerformed8(ActionEvent e) {
        	 if (button8.getText().equals("") && (Main.turnplayer == true )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button8.setFont(police);	
        		 
        		 button8.setText("X");
             		Main.turnplayer=false;
            	  button8.setBackground(Color.RED);
             	  //i = true;
            	  i+=1;
        	 }
        	 else if (button8.getText().equals("") && (Main.turnplayer == false )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button8.setFont(police);	
        		 
        		 button8.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
            		  button8.setBackground(Color.YELLOW);
             		//i = true;
            		  i+=1; 
        	 }
             }
        
 
        private void ActionPerformed9(ActionEvent e) {
        	
        	
        	
        	 if (button9.getText().equals("") && (Main.turnplayer == true )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button9.setFont(police);	
        		 
        		 button9.setText("X");
             		Main.turnplayer=false;
             		  button9.setBackground(Color.RED);	
             		// j=true;
             		 i+=1;       	 
        	 }
        	 else if (button9.getText().equals("") && (Main.turnplayer == false )){
        		 Font police = new Font("Thoma",Font.BOLD,25);
           		button9.setFont(police);	
        		 
        		 button9.setText("O");
             		Main.winner();
             		Main.turnplayer = true ;
             	  button9.setBackground(Color.YELLOW);
             		// j=true;
             	 i+=1;
             		  }
             }

        public void initComponents() {
        	        	           
               this.setTitle("TIC-TAC-TOE");
               this.setSize(400, 400);
               
               this.setLocationRelativeTo(null);
               GridLayout gl = new GridLayout(3,3);
               gl.setHgap(5);
               gl.setVgap(5);
               this.setLayout(gl);
               this.getContentPane().add(button1);
               this.getContentPane().add(button2);
               this.getContentPane().add(button3);
               this.getContentPane().add(button4);
               this.getContentPane().add(button5);
               this.getContentPane().add(button6);
               this.getContentPane().add(button7);
               this.getContentPane().add(button8);
               this.getContentPane().add(button9);
               this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
               this.setVisible(true);
               
               
               
               
               
             
                button1.setText("");
                button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed1(e);
                            
                        }
                });
 
             
                button2.setText("");
                button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                             ActionPerformed2(e);
                        }
                });
 
             
                button3.setText("");
                button3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                             ActionPerformed3(e);
                        }
                });
 
             
                button4.setText("");
                button4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed4(e);
                        }
                });
 
             
                button5.setText("");
                button5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                 ActionPerformed5(e);
                        }
                });
 
             
                button6.setText("");
                button6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed6(e);
                        }
                });
 
             
                button7.setText("");
                button7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed7(e);
                        }
                });
 
              
                button8.setText("");
                button8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed8(e);
                        }
                });
 
                button9.setText("");
                button9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                ActionPerformed9(e);
                        }
                        
                });   
                               
        }
}