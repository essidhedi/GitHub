package Game;

import java.util.Scanner;

import javax.swing.AbstractButton;

import com.sun.prism.paint.Color;

public class Main {
	
	public static boolean winerPlayer1 = false ;
	public static boolean winerPlayer2 = false;
	public static boolean turnplayer = true ;
    public static   tictactoe fn = new tictactoe();
	
    
    
    public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Main main = new Main();
	}
	public static void winner(){
    // player 1 
		
		if((fn.button1.getText().equals("X")) && (fn.button2.getText().equals("X")) && (fn.button3.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}
		
		else if((fn.button4.getText().equals("X")) && (fn.button5.getText().equals("X")) && (fn.button6.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}
		
		else if((fn.button7.getText().equals("X")) && (fn.button8.getText().equals("X")) && (fn.button9.getText().equals("X"))) {
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}

		else if((fn.button1.getText().equals("X")) && (fn.button4.getText().equals("X")) &&(fn.button7.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}

		else if((fn.button2.getText().equals("X")) && (fn.button5.getText().equals("X")) && (fn.button8.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}
		
		else if((fn.button3.getText().equals("X")) && (fn.button6.getText().equals("X")) && (fn.button9.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           		}
		
		else if((fn.button1.getText().equals("X")) && (fn.button5.getText().equals("X")) && (fn.button9.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}
		
		else if((fn.button3.getText().equals("X")) && (fn.button5.getText().equals("X")) && (fn.button7.getText().equals("X"))){
		             winerPlayer1 = true;
		             winerPlayer2 = false;
		             System.out.println("Player1 wins  :)))))))))) ");
		           
		}

		
		// player 2
		else if((fn.button1.getText().equals("O")) && (fn.button2.getText().equals("O")) && (fn.button3.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}
		
		else if((fn.button4.getText().equals("O")) && (fn.button5.getText().equals("O")) && (fn.button6.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}
		
		else if((fn.button7.getText().equals("O")) && (fn.button8.getText().equals("O")) && (fn.button9.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}

		else if((fn.button1.getText().equals("O")) && (fn.button4.getText().equals("O")) && (fn.button7.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}

		else if((fn.button2.getText().equals("O")) && (fn.button5.getText().equals("O")) && (fn.button8.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}
		
		else if((fn.button3.getText().equals("O"))&& (fn.button6.getText().equals("O")) && (fn.button9.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}
		
		else if((fn.button1.getText().equals("O")) && (fn.button5.getText().equals("O")) && (fn.button9.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		             
		}
		
		else if((fn.button3.getText().equals("O")) && (fn.button5.getText().equals("O")) && (fn.button7.getText().equals("O"))){
		             winerPlayer1 = false;
		             winerPlayer2 = true;
		             System.out.println("Player2 wins  :)))))))))) ");
		}
		
		//  whyyyyy
	
			
	/*	 if     (((fn.button1.equals("X"))||(fn.button1.equals("O"))) &&
			        ((fn.button2.equals("X"))||(fn.button2.equals("O"))) &&
			           ((fn.button3.equals("X"))||(fn.button3.equals("O")))&&
			    	      ((fn.button4.equals("X"))||(fn.button4.equals("O")))&&
						     ((fn.button5.equals("X"))||(fn.button5.equals("O")))&&
			    		        ((fn.button6.equals("X"))||(fn.button6.equals("O")))&&
			    		           ((fn.button7.equals("X"))||(fn.button7.equals("O")))&&
			    		              ((fn.button8.equals("X"))||(fn.button8.equals("O")))&&
			    		                ((fn.button9.equals("X"))||(fn.button9.equals("O"))))
			    		               {																	
		                                
			                            System.out.println("we have no winner ");
		                                System.out.println("would you like to play again");
		                                Scanner sc1 = new Scanner(System.in);
		                                boolean scr1 = sc1.nextBoolean();
		
	                                              if (scr1 == true )
	                                               {
	
                                            		fn.initComponents();
		                                            winerPlayer1 = false ;
		                                            winerPlayer2 = false;
		                                            turnplayer = true ;	
		
		                                            fn.button1.setBackground(null);
		                                            fn.button2.setBackground(null);
		                                            fn.button3.setBackground(null);
		                                            fn.button4.setBackground(null);
		                                            fn.button5.setBackground(null);
		                                            fn.button6.setBackground(null);
		                                            fn.button7.setBackground(null);
		                                            fn.button8.setBackground(null);
		                                            fn.button9.setBackground(null);
	                                                }
		  
	                                  }    */
	/*	if     ((fn.button1.equals("X"))||(fn.button1.equals("O"))) {
		       if ((fn.button2.equals("X"))||(fn.button2.equals("O"))){ 
		         if  ((fn.button3.equals("X"))||(fn.button3.equals("O"))){
		    	   if   ((fn.button4.equals("X"))||(fn.button4.equals("O"))){
					 if    ((fn.button5.equals("X"))||(fn.button5.equals("O"))){
		    		   if     ((fn.button6.equals("X"))||(fn.button6.equals("O"))){
		    		     if      ((fn.button7.equals("X"))||(fn.button7.equals("O"))){
		    		       if       ((fn.button8.equals("X"))||(fn.button8.equals("O"))){
		    		         if       ((fn.button9.equals("X"))||(fn.button9.equals("O"))){
		    		               {																	
	                                
		                            System.out.println("we have no winner ");
	                                System.out.println("would you like to play again");
	                                Scanner sc1 = new Scanner(System.in);
	                                boolean scr1 = sc1.nextBoolean();
	
                                              if (scr1 == true )
                                               {

                                        		fn.initComponents();
	                                            winerPlayer1 = false ;
	                                            winerPlayer2 = false;
	                                            turnplayer = true ;	
	
	                                            fn.button1.setBackground(null);
	                                            fn.button2.setBackground(null);
	                                            fn.button3.setBackground(null);
	                                            fn.button4.setBackground(null);
	                                            fn.button5.setBackground(null);
	                                            fn.button6.setBackground(null);
	                                            fn.button7.setBackground(null);
	                                            fn.button8.setBackground(null);
	                                            fn.button9.setBackground(null);
                                                }}}}}}}}}}
		    		               }*/
	
	/*	 if   ((fn.a==true)&&(fn.b==true)&&(fn.c==true)&&(fn.d==true)&&
				 (fn.f==true)&&(fn.g==true)&&(fn.h==true)&&(fn.i==true)&&(fn.j==true))
			    		               {																	
		                                
			                            System.out.println("we have no winner ");
		                                System.out.println("would you like to play again");
		                                Scanner sc1 = new Scanner(System.in);
		                                boolean scr1 = sc1.nextBoolean();
		
	                                              if (scr1 == true )
	                                               {
	
                                         		fn.initComponents();
		                                            winerPlayer1 = false ;
		                                            winerPlayer2 = false;
		                                            turnplayer = true ;	
		
		                                            fn.button1.setBackground(null);
		                                            fn.button2.setBackground(null);
		                                            fn.button3.setBackground(null);
		                                            fn.button4.setBackground(null);
		                                            fn.button5.setBackground(null);
		                                            fn.button6.setBackground(null);
		                                            fn.button7.setBackground(null);
		                                            fn.button8.setBackground(null);
		                                            fn.button9.setBackground(null);
	                                                }
		  
	                                  } */
		
		  /*															
            if (fn.i == 9){  
              System.out.println("we have no winner ");
              System.out.println("would you like to play again");
              Scanner sc1 = new Scanner(System.in);
              boolean scr1 = sc1.nextBoolean();

                        if (scr1 == true )
                         {

                  		fn.initComponents();
                          winerPlayer1 = false ;
                          winerPlayer2 = false;
                          turnplayer = true ;	

                          fn.button1.setBackground(null);
                          fn.button2.setBackground(null);
                          fn.button3.setBackground(null);
                          fn.button4.setBackground(null);
                          fn.button5.setBackground(null);
                          fn.button6.setBackground(null);
                          fn.button7.setBackground(null);
                          fn.button8.setBackground(null);
                          fn.button9.setBackground(null);
                          }

            }*/
		
		
		 if ((winerPlayer1 == true) || ( winerPlayer2 == true))
		 {
			System.out.println("would you like to try again : True or false ");
			Scanner sc = new Scanner(System.in);
			boolean scr = sc.nextBoolean();
		
			        if (scr == true )
			        {
		
		    	        fn.initComponents();
			            winerPlayer1 = false ;
			            winerPlayer2 = false;
			            turnplayer = true ;	
			
			            fn.button1.setBackground(null);
			            fn.button2.setBackground(null);
			            fn.button3.setBackground(null);
			            fn.button4.setBackground(null);
			            fn.button5.setBackground(null);
			            fn.button6.setBackground(null);
			            fn.button7.setBackground(null);
			            fn.button8.setBackground(null);
			            fn.button9.setBackground(null);
				  
		          }
		}
		 
		 	
		 
		 
	}
	}
			
	
	
		 
                

		             
	

