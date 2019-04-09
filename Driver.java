

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ArrayList ob=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int choice;
		int f = 1;
		while(f==1) {
		System.out.println("1.insert element\n2.add with index\n3.delete element\n4.traverse array\n5.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		          f=1;
		         Integer  value1=sc.nextInt();
		         ob.Add(value1);
		           break;
		case 2:System.out.println("enter the element");

                  Integer  value2=sc.nextInt();
                  f=1;
								System.out.println("enter the index");
                Integer  index1=sc.nextInt();
								ob.Add(value2,index1);
                  break;
		case 3:
System.out.println("enter the index");
  Integer  index2=sc.nextInt();
			f=1;
			ob.remove(index2);
		    break;

		case 4:
	     ob.traverse();
	     f=1;
	     break;
		case 5:
			 f=2;
			 break;

		}}


	}

}
