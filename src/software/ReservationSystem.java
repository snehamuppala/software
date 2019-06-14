/*
 * TEAM 11
Karan Manchandia (karanman)
Trishala Kaushik (tkaushik)
Sneha Muppala (snehamup)
Xingyu Yan (xingyuya)
Krishna Sehgal (ksehgal)

 */




package software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;



import java.awt.*;  
import java.awt.event.*; 

public class ReservationSystem {
	static ArrayList<Student> queueStudent = new ArrayList<>();
	public static String displaystring=null;
	
	public static String displayStatus() {
		
		// TODO Auto-generated method stub
		int serial=0;
		for (Student s : queueStudent)
		{  
			serial++;
//			System.out.println(s.studentEmailId); 
//			System.out.println(s.questions); 
//			System.out.println(s.time); 
//			System.out.println(s.blockDate);
			if(serial==1) {
				displaystring=serial+" StudentEmail: "+s.studentEmailId+" \nQuestions : "+s.questions+"\nAppointment Time: "+s.time+"<br/>";
			}
			else {
				displaystring+=serial+" StudentEmail: "+s.studentEmailId+" \nQuestions : "+s.questions+"\nAppointment Time: "+s.time+"<br/>";
			}
			
			
			
		}
		return "<html>"+displaystring+"</html>";
		
	}
	
	
	
	
	
	

	
	
	public boolean markPresent() {
		String popMessage=null;
		
	
		
		if(queueStudent.size()==0) {
			
			//popup
			 popMessage="Queue is empty";
			System.out.println("Queue is empty"); 
			return true;
		}
		else {
			
			
			Student s = queueStudent.get(0);
			
			s.setstatus("Present");
			
			Student s1 =queueStudent.remove(0);
			//displayDetails( s1);
			return true;
			
		}
		
		
		
	}
	
	
	
//	public String displayDetails(Student s1) {
//		
//		displaystring=" StudentEmail: "+s1.studentEmailId+" \nQuestions : "+s1.questions+"\nAppointment Time: "+s1.time+"\nStatus: "+s1.status+"<br/>";
//		
//		
//		return displaystring;
//		
//	}
	
	
	
	
public static String retrievefirstappointmet() {
	
	String popMessage=null;
	
	
	
	if(queueStudent.size()==0) {
		
		//popup
		popMessage="Queue is empty";
		System.out.println("Queue is empty"); 
	}
	else {
		
		
		
		popMessage="Queue is not empty";
		System.out.println("Queue is not empty"); 
		int serial=1;
		Student s = queueStudent.get(0);
		
		System.out.println(s.studentEmailId); 
//		System.out.println(s.questions); 
//		System.out.println(s.time); 
//		System.out.println(s.blockDate);
			
		displaystring=serial+" StudentEmail: "+s.studentEmailId+" \nQuestions : "+s.questions+"\tAppointment Time: "+s.time+"<br/>";
			
		
	}
			// TODO Auto-generated method stub
		
		//
		return "<html>"+displaystring+"</html>";
		
		
	}

public static void removeStudent() {
	queueStudent.remove(0);
}







	
	public static void createQueue() {
		Date date1= new Date();
		 //Date d1=date1.getTime();
		 long m1=500000000;
		 long m2=0;
		 long m4=100000;
		 long m3=200000;
		 Date d1 = new Date(date1.getTime() - m1);
		 Date d2 = new Date(date1.getTime() - m2);
		 Date d3 = new Date(date1.getTime() - m3);
		 Date d4 = new Date(date1.getTime() - m4);
		
		// System.out.println(formatter.format(date));
		 //(5*60*1000)
		 


queueStudent.add(new Student("snehamup@buffalo.edu","Doubts on GUI",d1,null,null));
queueStudent.add(new Student("trishala@buffalo.edu","Doubts on Class Diagram",d2,null,null));
queueStudent.add(new Student("karan@buffalo.edu",null,d3,null,null));
queueStudent.add(new Student("krishna@buffalo.edu",null,d4,null,null));
Collections.sort(queueStudent, new TimeSort());	
	}
	

	private JFrame frame1;
	private JFrame frame2;
	private JFrame frame3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ReservationSystem.createQueue();
		String display= ReservationSystem.displayStatus();
		System.out.println(display);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationSystem window = new ReservationSystem();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReservationSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(500, 500, 900, 800);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		frame2 = new JFrame();
		frame2.setBounds(500, 500, 900, 800);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		 
		
		
		frame3 = new JFrame();
		frame3.setBounds(500, 500, 900, 800);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JButton btnNextStudent = new JButton("Next Student");
		btnNextStudent.setBounds(29, 232, 122, 23);
		frame2.getContentPane().add(btnNextStudent);
		
		
		JButton btnMarkPresent = new JButton("Mark Present");
		btnMarkPresent.setBounds(29, 232, 122, 23);
		frame1.getContentPane().add(btnMarkPresent);
		
		
		
		
		
		
		
		
			
			
			btnMarkPresent.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){ 
			    	 JLabel statusLabel;
			    	 
			    	 final TextField tf=new TextField();  
			    	 tf.setBounds(100, 100, 900, 100);
			    	 frame2.setVisible(false);
			    	 frame1.setVisible(false);
			    	
			    	 frame2.add(btnNextStudent);
			    	 frame2.setVisible(true);
			    	
			    	// frame1.getContentPane().add(statusLabel1);
			    	statusLabel= new JLabel(retrievefirstappointmet());
			    			 
			    	 
			    	 
			    	
		 		statusLabel.setBounds(100, 100, 900, 100);
		 		frame2.add(statusLabel); 
		 		frame2.getContentPane().add(statusLabel);
		 		 System.out.println(("Size"+queueStudent.size()));    
			        
			        queueStudent.remove(0);
			        System.out.println(("Size inside:::"+queueStudent.size()));   
			        
			        System.out.println(("next student :::"+queueStudent.get(0).studentEmailId));  
			       	
			        
			    }
			    
			     
			 }); 
			
			
			
		
		
		
		
		
		
		btnNextStudent.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){ 
		    	JLabel statusLabel;
		    	
		    	
		    	 final TextField tf=new TextField();  
		    	 tf.setBounds(100, 100, 900, 100);
		    	
		    	 frame2.setVisible(false);
		    	 frame1.setVisible(true);
		    	 
		    	 System.out.println(("Size before ::"+queueStudent.size())); 
		    	 
		    	 statusLabel= new JLabel();
		    	 
		    	
	 		statusLabel.setBounds(100, 100, 900, 100);
	 		//frame1.add(statusLabel); 
	 		//frame1.getContentPane().add(statusLabel);
	 		
	 		 System.out.println(("Size after "+queueStudent.size()));    
		        
		
		        System.out.println(("Size next button :::"+queueStudent.size()));   
		        
		        System.out.println(("nexttt2  student:::"+queueStudent.get(0).studentEmailId));  
		       
		        
		    }
		     
		 }); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btnMarkAbsent = new JButton("Mark Absent");
		btnMarkAbsent.setBounds(280, 232, 129, 23);
		frame1.getContentPane().add(btnMarkAbsent);
		
		
		
		
		btnMarkAbsent.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){ 
		    
		    	 final TextField tf=new TextField();  
		    	 tf.setBounds(100, 100, 900, 100);
		    	 
		    	
		    	 frame2.setVisible(true);
		    JLabel statusLabel = new JLabel(retrievefirstappointmet());
		    	 
		    	
	 		statusLabel.setBounds(100, 100, 900, 100);
	 		frame2.add(statusLabel); 
	 		frame2.getContentPane().add(statusLabel);
	 		 System.out.println(("Size"+queueStudent.size()));    
	 		
	 		 
		        Student s=new Student(null, null, null, null,null);
		        s= queueStudent.remove(0);
		        queueStudent.add(s);
		        System.out.println(("Sizenext:::"+queueStudent.size()));   
		         
		        System.out.println(("student 0:::"+queueStudent.get(queueStudent.size()-1).studentEmailId));  
		        System.out.println(s.getTime());
		        Date curr=new Date();
		        Date difftime=s.getTime();
		        System.out.println("Sneha time"+s.time.getTime());
		        System.out.println("current time"+curr.getTime());
		        long timedif=s.time.getTime() - curr.getTime();
		        System.out.println(timedif);
		        if (timedif>10000000)
		        {
		        	s.setBlockDate(curr);
		        	System.out.println("Blocked student"+s.getBlockDate());
		        	
		        	queueStudent.remove(queueStudent.size()-1);
		        }
		    }
		 }); 
//		JButton btnShowQueueStatus = new JButton("Show Queue Status");
//		btnShowQueueStatus.setBounds(125, 198, 180, 23);
//		frame1.getContentPane().add(btnShowQueueStatus);
//		
//		JLabel statusLabel = new JLabel(displayStatus());
//		statusLabel.setBounds(100, 100, 900, 100);
//		frame.getContentPane().add(statusLabel);
		
		
		
		
		JLabel lblNewLabel = new JLabel("TA Appointment Reservation System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(48, 11, 330, 14);
		frame1.getContentPane().add(lblNewLabel);
		
		
		
		JLabel statusLabel1 = new JLabel(retrievefirstappointmet());
		statusLabel1.setBounds(100, 100, 900, 100);
		frame1.getContentPane().add(statusLabel1);
	}
}
