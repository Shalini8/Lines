public class LineUC2 {
public static void main(String args[])	
		{
	            int x1,x2,y1,y2;
	           
	            int x3,x4,y3,y4;
	            double dis2;
		         double dis1;
		    x1=1;y1=1;x2=4;y2=4;
		    x3=1;y3=2;x4=3;y4=2;
		    dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
		    dis2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));	 	    
		    String s=String.valueOf(dis1);
		    String s1=String.valueOf(dis2);
		    System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);
		    System.out.println("distancebetween"+"("+x3+","+y3+"),"+"("+x4+","+y4+")===>"+dis2);  
		    if (s.equals(s1)) {  
	            System.out.println("both lines are equal");  
		    	}
	            else {
	        	System.out.println("both lines are unequal");     
	            }  
		    
		}
		
	}

