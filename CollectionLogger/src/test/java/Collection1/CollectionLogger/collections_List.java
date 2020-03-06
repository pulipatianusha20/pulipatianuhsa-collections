package Collection1.CollectionLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Integers;
import org.junit.Test;

public class collections_List {
	private static Logger logger=LogManager.getLogger(collections_List.class);
	@Test
	public void Collection_Logger() {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		String exit="No";
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		int size1=list1.size();
		//logger.info(size1);
		if( size1>=10){
			
			do {
			logger.info(" 1:add element into the list \n 2:remove Element from list \n 3:fetch element from list\n 4:diaplay list\n 5: size of arraylist\n 6:exit");
			logger.info("Enter your choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:logger.info("Enter element to add into array list\n");
					int element=sc.nextInt();
					list1.add(element);
					break;
			case 2:logger.info("Enter index of element to remove from arraylist\n");
					int index=sc.nextInt();
					int ele1=list1.remove(index);
					logger.debug("Deleted element from arraylist : "+ele1);
					break;
			case 3:logger.info("Enter index of element to fetch from arraylist\n");
					int index1=sc.nextInt();
					int ele2=list1.get(index1);
					logger.debug("Fetched element arraylist : "+ele2);
					break;
			case 4:logger.info("Arraylist elements are\n");
					Iterator<Integer> it1=list1.iterator();
			         while(it1.hasNext()) {
			        	 logger.debug(it1.next());			        	 			        	 
			         }
			         break;
			case 5:logger.info("size of Arraylist\n"); 		
					logger.debug(list1.size());
					break;
			case 6:  logger.info("exited\n");
					 break;
			default:logger.warn("Invalid choice \n Enter choice in(1-6)\n");        
					break;
			}
		  }while(ch!=6);
		  
        }
	   else {
			logger.warn("Arraylist should contain atleat 10 elements\n");
		}
		
		}
}
