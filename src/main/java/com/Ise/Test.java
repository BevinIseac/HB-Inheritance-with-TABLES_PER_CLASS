package com.Ise;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee Name : ");
		String Employeename = sc.nextLine();
		
		System.out.print("Regular employee name : ");
		String RegEmployeename = sc.nextLine();
		
		System.out.print("Salary of Regular Employee : ");
		float salary = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("Department of the Regilar employee : ");
		String Dept =sc.nextLine();
		
		System.out.print("Trainee Name : ");
		String Traineename = sc.nextLine();
		
		System.out.print("Contract period of Trainee : ");
		String Contractperiod = sc.nextLine();
		
		System.out.print("Payperhour for Trainee : ");
		int payperhour = sc.nextInt();
		sc.nextLine();
		
		Transaction tr = null;
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			System.out.print("after ses factory");
			tr=ses.beginTransaction();
			Employee e1=new Employee(Employeename);
			RegEmployee e2=new RegEmployee(salary,Dept,RegEmployeename);
			Trainee e3=new Trainee(payperhour,Contractperiod,Traineename);
			
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			tr.commit();
			ses.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
