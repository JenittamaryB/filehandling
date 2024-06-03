package Filedemo;

import java.io.BufferedReader;
import java.io.File;//import is used for access the package and their classes
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLearn 
{
	public static void main(String[] args) throws IOException {
		FileLearn f=new FileLearn();
        //f.createFileDemo();
        //f.createFolderSubFolder();
        //f.writeFile();
        f.fileRead();
		//f.changeToChar();
	}
  void createFileDemo() throws IOException
  {
	  File file = new File("C:\\Users\\Muthu\\Learn.txt");
	  boolean result=file.createNewFile();
	  System.out.println(result);
  }	
  void createFolderSubFolder() throws IOException
  {
	  File file = new File("C:\\Users\\Muthu\\Learn1.txt");
	  boolean result=file.createNewFile();
		//boolean result = file.delete();//to delete the file
		System.out.println(result);
		
		 file = new File("C:\\Users\\Muthu\\learning4\\notes");
		file.mkdirs();//it is makedirectries method to  create folder 
  }
  void writeFile() throws IOException
  {
	    File file = new File("C:\\Users\\Muthu\\ learning3.txt");
		FileWriter fw = new FileWriter(file);   //true
		fw.write("vanakam " );
		fw.flush();//this method is write with filewritter program
		fw.close();
		
  }
  void fileRead() throws IOException
  {
	    File file = new File("C:\\Users\\Muthu\\ learning3.txt");
		FileReader reader = new FileReader(file);
		
		
		BufferedReader bout=new BufferedReader(reader);  //it is used for read  Line by line using readline()  
		String result=bout.readLine();//it print the string inside the file  in string directly
		System.out.println(result);
		
		//int result = reader.read();//this gives the ascii value not in string
		//System.out.println(result);
  }
  void changeToChar() throws IOException
  {
	  File file = new File("C:\\Users\\Muthu\\ learning3.txt");
		FileReader reader = new FileReader(file);
		int result = reader.read();
		while(result!=0)//if result 
		{
          result=reader.read();
		  System.out.print((char)result);//here we typecast  to char this give the exact letter in the file char	
		}	
  }
}

