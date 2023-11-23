package com.cg;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Phone;
import com.cg.entity.Phoneuser;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

    public static void main(String[] args) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");

            EntityManager em = emf.createEntityManager();



            em.getTransaction().begin();



            Phoneuser phoneUser = new Phoneuser();

            phoneUser.setUsername("suresh");

            phoneUser.setUseremail("suresh@mail.com");

            phoneUser.setUserid(4);

           

            Phone phone1=new Phone();

            phone1.setPhoneno(989949);

            phone1.setPhonetype("Mobile");

            phone1.setUserid(1);

           

            Phone phone2=new Phone();

            phone2.setPhoneno(898989);

            phone2.setPhonetype("LandLine");

            phone2.setUserid(3);

           

            List<Phone> list = new ArrayList<Phone>();

            list.add(phone1);

            list.add(phone2);



            phoneUser.setPhoneTables(list);

           

            em.persist(phoneUser);

            em.getTransaction().commit();

           

            em.getTransaction().begin();

            // User can access Phone Number

            Phoneuser u = em.find(Phoneuser.class, 1);

            System.out.println("userId is "+u.getUserid());

            System.out.println("UserName is "+u.getUsername());

                           

            List<Phone> list1 = u.getPhoneTables();

            for(Phone p:list1){

                    System.out.println("Phone Number is "+p.getPhoneno());

                    System.out.println("phone Type is "+p.getPhonetype());

               
            }
            //Phone Number cannot access User Details

            /*Phone ph=(Phone)ses.load(Phone.class, new Integer(1));

            System.out.println("Phone Number is "+ph.getPhoneno());

            System.out.println("phone Type is "+ph.getPhonetype());

            */

    }

}