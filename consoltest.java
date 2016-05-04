package task1;

import java.io.*;
import java.util.ArrayList;

class Test 
{ 
private int count;
private boolean flag=true;

public void setcount(int count){
	this.count = count;
}
public int getcount(){
	return count;
}
public void raisecount(){
	count = count +1;
}
public void setFlag(boolean flag){
	this.flag = flag;
}
public boolean getFlag(){
	return flag;
}

public static void main(String[] args) throws IOException 
   { 
	int a = 0;	
	int b = 0;	
	System.out.println(" Enter first number" );
	String first;
	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ));
	try {
		first = in.readLine();
		a =Integer.parseInt(first);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(" Enter second number" );
	String second;
	try {
		second = in.readLine();
		b =Integer.parseInt(second);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	in.close();
	ArrayList<Integer> lt = new ArrayList<>();
	
	Test ct = new Test();
	if (b-a>=0) {
		for (int i = a; i <= b; i++) 
		{
			int x=i;
			
			while (x>0)
			{
				String s = "" + x;
				String d =Character.toString(s.charAt(s.length()-1));				
				int c = Integer.parseInt(d);
				x=x/10;
				lt.add(c);
								
			}
			
			for (int j = 0; j < 10; j++)
			{
				
				ct.setcount(0);

				
				for (int j2 = 0; j2 <lt.size(); j2++) 
				{
					
					
					if (j==lt.get(j2)) 
					{		
						ct.raisecount();
							if (ct.getcount()>1) {
								ct.setcount(0);
								lt.clear();
								ct.setFlag(false);
								break;
									}					
					}
					
				}			
			}
			
			lt.clear();
			boolean temp= ct.getFlag();
			if (temp==true) {
				System.out.println(i);				
			}	
			ct.setFlag(true);
		}
	}
	else{
		System.out.println("wrong interval");
	}
    } 
} 