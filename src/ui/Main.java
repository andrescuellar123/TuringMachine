package ui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.*;
public class Main {

	public static void main(String[] args) throws IOException {
		listNodes lst = new listNodes();


		BufferedReader bf = new BufferedReader(new FileReader("data/short.txt"));

		String line1;
		ArrayList<String> arr = new ArrayList<String>();
		while(( line1 =  bf.readLine()) != null) {
			String [] arrayFirstLine = line1.split("");
			for (int i = 0; i < arrayFirstLine.length; i++) {
				arr.add(arrayFirstLine[i]);
			}
		}
		bf.close();





		
		
		ArrayList <String> defArr = new ArrayList<String>();
			int vari =0;
			for (int i = 0; i < arr.size();  i=i+vari) {
				


				
				if(arr.get(i).equals("0")) {
				

					if(arr.get(i+1).equals("0")) {
						
						System.out.println(lst.getFirst().getLetter());
						defArr.add(lst.getFirst().getLetter());
						System.out.println("imp");
						vari = 2;
						
					}
					else if(arr.get(i+1).equals("1") ) {

						
						
						lst.addNodeBegining(arr.get(i+2));
						System.out.println(arr.get(i+2) +"lilo");		
						vari=3;	
					}
					else if(arr.get(i+1).equals( "2" )) {

					lst.removeNodeFirst(lst.getFirst().getLetter());
					vari = 2;
					}


				}

				else if(arr.get(i).equals("1")) {

				

					if(arr.get(i+1).equals("0")) {
						
						System.out.println(lst.getMid());
						defArr.add(lst.getMid()+"\n");
						System.out.println("imp");
						vari = 2;
					}	
					else if(arr.get(i+1).equals("1") ) {
						
						lst.insertMid(((arr.get(i+2))));
						System.out.println(arr.get(i+2)+"lele");
						vari=3;	
						
					
					}
					else if(arr.get(i+1).equals( "2" )) {

						lst.removeNodeMid(lst.getMid());
						vari = 2;
					}

				}

				else if(arr.get(i).equals("2")) {
			

					if(arr.get(i+1).equals("0")) {
						
						System.out.println(lst.getEnd());
						defArr.add(lst.getEnd()+"\n");
						System.out.println("imp");
						vari = 2;
					}
					else if(arr.get(i+1).equals("1") ) {
						
						lst.insertEnd(((arr.get(i+2))));
						System.out.println(arr.get(i+2) +"lolo");
						
						vari=3;	
					
					}
					else if(arr.get(i+1).equals( "2" )) {
						
						lst.removeNodeEnd(lst.getEnd()) ;

						vari = 2;
					}




				}
	
			
			}
			
			
			
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("data/data2.txt"));
	
			for (int i = 0; i < defArr.size(); i++) {
				bw.write(defArr.get(i)+"\n");
			}
			
			bw.close();

		}
	



}
