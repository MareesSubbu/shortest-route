package com.shortest.utility;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import org.springframework.stereotype.Component;

import com.shortest.model.Shortest;

@Component
public class DynProgram {

	 
	Vector<String> elements = new Vector<String>();
	
	public Shortest findBestRoute(String startingPoint, String cities, String matrix) { //initComponents();     
		 // boolean status = true;  
		System.out.println(startingPoint +"==" +cities + "=="+matrix );
		  ArrayList<String> elements = new ArrayList<String>();  
		  ArrayList<Double> least = new ArrayList<Double>(); 
		  ArrayList<String> path = new ArrayList<String>();   
		  double least_value = 0;        
		//  double temp_var = 0;       
		  String least_path = ""; 
		  // String[][] items = new String[5][5];
		  Integer orgin=Integer.parseInt(startingPoint);
		  ArrayList<String> list=new ArrayList<>();
		  ArrayList<Double> list1=new ArrayList<>();
		 // String inputValues="0,12,10,19,8,12,0,3,7,2,10,3,0,6,20,19,7,6,0,4,8,2,20,4,0";
		  //Object created to handle file loading   
					     
		  int k = 1;  
			StringTokenizer st=null;
		   
			  st = new StringTokenizer(matrix, " ");
		
		  while (st.hasMoreTokens()) {    
				//Object to store all values       
				elements.add(st.nextToken());   
				++k;      
				} 
		           
			//Stores the input file values into an array 
		    double dist[][] = new double[(int) Math.sqrt(k)][(int) Math.sqrt(k)];  
			int p = 0;      
			for (int l = 0; l < dist.length; l++) {    
			for (int m = 0; m < dist[0].length; m++) {  
			dist[l][m] = Double.parseDouble(elements.get(p));   
			p++;               
			}         
			}              
			//System.out.println(Math.sqrt(k)); 
		    Permutator pg = new Permutator((int) Math.sqrt(k), 1);  
			double sum = 0;   
			String g = "";    
			String v = ""; 
			while (pg.hasMore()) {    
				int[] temp = pg.getNext();    
				for (int j = 0; j < temp.length; j++) { 
				g += (temp[j]) + "-";    
				v += temp[j] + " ";     
		        }  
				g+=orgin.toString();
				v+=orgin.toString();
				String words [] = g.split("-");
				//words[words.length+1] = orgin.toString();
				path.add(v);    
				//System.out.println("=="+g); 
				g = "";        
				v = "";         
				for (int r = 0; r < words.length - 1; r++) { 
					sum += dist[Integer.parseInt(words[r]) - 1][Integer.parseInt(words[r+1]) - 1];    
				}                             
				//System.out.println(sum);   
				least.add(sum);       
				//Stores all outcomes   
				sum = 0;        
				//empties the sum variable to make room for another value  
				}        
				 //computes for the least distance  
  
				
				for(String str:path) {
					if(str.startsWith(orgin.toString())) {
						list.add(str);
						//System.out.println("====="+str);
						String words [] = str.split(" ");
						sum=0;
						for (int r = 0; r < words.length - 1; r++) { 
							sum += dist[Integer.parseInt(words[r]) - 1][Integer.parseInt(words[r+1]) - 1];
							
						}
						list1.add(sum);
						//Collections.sort(list1);
						System.out.println("==="+str+"==="+sum);
					}
				}
		  			
					for (int w = 0; w < list1.size(); w++) {     
		            if (w == 0) {     
					least_value = list1.get(w);    
					least_path = list.get(w);    
					}               
					if (list1.get(w) < least_value) {  
					least_value = list1.get(w);    
					least_path = list.get(w);    
					}          
					}           
					//outputs the file as a text namely result.txt   
					String out = (least_path +" &" + least_value); 
					/*try{            
					FileOutputStream fout = new FileOutputStream(new File("D:/result.txt")); 
					  
					for(int r = 0; r < out.length() ; r ++){     
		            Character c = (char)out.charAt(r); 
		            //System.out.println(c);
		            
					fout.write(c);       
					}           
					} catch(IOException ex){ 
					ex.printStackTrace();    
					}*/
					Shortest sh=new Shortest();
					sh.setResult(out);
					return sh; 
					} 
					}

