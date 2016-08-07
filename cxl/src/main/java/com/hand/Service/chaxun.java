package com.hand.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;

import com.hand.entities.Film;

import com.util.ConnectionFactory;

public class chaxun {
private UserDao userdao=new UserDaoImpl();
Connection conn=null;
public List<Film> cha(){
	
	List<Film> films=null;
	
		
		try {
			ConnectionFactory  fac=ConnectionFactory.getInstance();
			conn=fac.makeConnection();
			films=userdao.getAllFilmList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return films;
		
	
}
public Boolean serviceDelete(String title){
     boolean b=true;
     ConnectionFactory  fac=ConnectionFactory.getInstance();
		conn=fac.makeConnection();
      
		try {
			b= userdao.delete(conn, title);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
		
		
	
}




}
