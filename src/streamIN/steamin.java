package streamIN;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class steamin
{

	public static void main(String[] args) throws IOException
	{
		
		int i;  
        if(args.length < 2){  
            System.out.println("涂涂问你要打开哪个文件");  
            System.exit(1);  
        }  
        for( i=0; i<args.length; i++)
      
        		System.out.println(args[i]);        //遍历输出args[]中元素   
          
        FileReader fr = new FileReader(args[0]);  
  
        FileWriter fw = new FileWriter(args[1]);  
  
        System.out.println("涂涂说把"+args[0]+"写入"+args[1]);  
  
        while((i=fr.read())!=-1){  
            System.out.print((char)i);  
            fw.write(i);  
        }  
        fw.close(); 
        
      /*
		// TODO Auto-generated method stub
		try { 
			//缓冲System.in输入流 
			//System.in是位流，可以通过InputStreamReader将其转换为字符流 
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in)); 
			//缓冲FileWriter 
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter(args[0])); 
			String input = null; 
			//每读一行进行一次写入动作 
			while(!(input = bufReader.readLine()).equals("quit")) { 
				bufWriter.write(input); 
				//newLine()方法写入与操作系统相依的换行字符，依执行环境当时的OS来决定该输出那种换行字符 
				bufWriter.newLine(); 
			} 
			bufReader.close(); 
			bufWriter.close(); 
			} catch(ArrayIndexOutOfBoundsException e) { 
				System.out.println("没有指定文件"); 
			} catch(IOException e) { 
				e.printStackTrace(); 
			}  */
	}

}
